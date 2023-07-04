package com.simibubi.create.content.equipment.toolbox;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.utility.NBTHelper;

import io.github.fabricators_of_create.porting_lib.transfer.callbacks.TransactionCallback;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemHandlerHelper;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandler;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandlerSnapshot;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.ItemStack;

public class ToolboxInventory extends ItemStackHandler {

	public static final int STACKS_PER_COMPARTMENT = 4;
	List<ItemStack> filters;
	boolean settling;
	private ToolboxBlockEntity blockEntity;

	private boolean limitedMode;

	public ToolboxInventory(ToolboxBlockEntity be) {
		super(8 * STACKS_PER_COMPARTMENT);
		this.blockEntity = be;
		limitedMode = false;
		filters = new ArrayList<>();
		settling = false;
		for (int i = 0; i < 8; i++)
			filters.add(ItemStack.EMPTY);
	}

	public void inLimitedMode(Consumer<ToolboxInventory> action) {
		limitedMode = true;
		action.accept(this);
		limitedMode = false;
	}

	public void settle(int compartment) {
		int totalCount = 0;
		boolean valid = true;
		boolean shouldBeEmpty = false;
		ItemStack sample = ItemStack.EMPTY;

		for (int i = 0; i < STACKS_PER_COMPARTMENT; i++) {
			ItemStack stackInSlot = getStackInSlot(compartment * STACKS_PER_COMPARTMENT + i);
			totalCount += stackInSlot.getCount();
			if (!shouldBeEmpty)
				shouldBeEmpty = stackInSlot.isEmpty() || stackInSlot.getCount() != stackInSlot.getMaxStackSize();
			else if (!stackInSlot.isEmpty()) {
				valid = false;
				sample = stackInSlot;
			}
		}

		if (valid)
			return;

		settling = true;
		if (!sample.isStackable()) {
			for (int i = 0; i < STACKS_PER_COMPARTMENT; i++) {
				if (!getStackInSlot(compartment * STACKS_PER_COMPARTMENT + i).isEmpty())
					continue;
				for (int j = i + 1; j < STACKS_PER_COMPARTMENT; j++) {
					ItemStack stackInSlot = getStackInSlot(compartment * STACKS_PER_COMPARTMENT + j);
					if (stackInSlot.isEmpty())
						continue;
					setStackInSlot(compartment * STACKS_PER_COMPARTMENT + i, stackInSlot);
					setStackInSlot(compartment * STACKS_PER_COMPARTMENT + j, ItemStack.EMPTY);
					break;
				}
			}
		} else {
			for (int i = 0; i < STACKS_PER_COMPARTMENT; i++) {
				ItemStack copy = totalCount <= 0 ? ItemStack.EMPTY
					: ItemHandlerHelper.copyStackWithSize(sample, Math.min(totalCount, sample.getMaxStackSize()));
				setStackInSlot(compartment * STACKS_PER_COMPARTMENT + i, copy);
				totalCount -= copy.getCount();
			}
		}
		settling = false;
		blockEntity.sendData();
	}

	@Override
	public boolean isItemValid(int slot, ItemVariant var) {
		ItemStack stack = var.toStack();
		if (!stack.getItem().canFitInsideContainerItems())
			return false;

		if (slot < 0 || slot >= getSlots())
			return false;
		int compartment = slot / STACKS_PER_COMPARTMENT;
		ItemStack filter = filters.get(compartment);
		if (limitedMode && filter.isEmpty())
			return false;
		if (filter.isEmpty() || ToolboxInventory.canItemsShareCompartment(filter, stack))
			return super.isItemValid(slot, var);
		return false;
	}

	@Override
	protected ItemStackHandlerSnapshot createSnapshot() {
		ItemStackHandlerSnapshot snapshot = super.createSnapshot();
		return new ToolboxSnapshotData(snapshot, new ArrayList<>(filters));
	}

	@Override
	public void setStackInSlot(int slot, ItemStack stack) {
		super.setStackInSlot(slot, stack);
		updateCompartmentFilters(slot, stack, null);
	}

	@Override
	protected void contentsChangedInternal(int slot, ItemStack newStack, TransactionContext ctx) {
		super.contentsChangedInternal(slot, newStack, ctx);
		updateCompartmentFilters(slot, newStack, ctx);
	}

	private void updateCompartmentFilters(int slot, ItemStack stack, @Nullable TransactionContext ctx) {
		int compartment = slot / STACKS_PER_COMPARTMENT;
		if (!stack.isEmpty() && filters.get(compartment)
				.isEmpty()) {
			filters.set(compartment, ItemHandlerHelper.copyStackWithSize(stack, 1));
			if (ctx != null) TransactionCallback.onSuccess(ctx, blockEntity::sendData);
			else blockEntity.sendData();
		}
	}

	@Override
	public CompoundTag serializeNBT() {
		CompoundTag compound = super.serializeNBT();
		compound.put("Compartments", NBTHelper.writeItemList(filters));
		return compound;
	}

	@Override
	protected void onContentsChanged(int slot) {
		if (!settling && !blockEntity.getLevel().isClientSide)
			settle(slot / STACKS_PER_COMPARTMENT);
		blockEntity.sendData();
		blockEntity.setChanged();
		super.onContentsChanged(slot);
	}

	@Override
	public void deserializeNBT(CompoundTag nbt) {
		filters = NBTHelper.readItemList(nbt.getList("Compartments", Tag.TAG_COMPOUND));
		if (filters.size() != 8) {
			filters.clear();
			for (int i = 0; i < 8; i++)
				filters.add(ItemStack.EMPTY);
		}
		super.deserializeNBT(nbt);
	}

	public ItemStack distributeToCompartment(@Nonnull ItemStack stack, int compartment, TransactionContext ctx) {
		if (stack.isEmpty())
			return stack;
		if (filters.get(compartment)
			.isEmpty())
			return stack;

		updateSnapshots(ctx);
		int toInsert = stack.getCount();
		int inserted = 0;
		for (int i = STACKS_PER_COMPARTMENT - 1; i >= 0; i--) {
			int slot = compartment * STACKS_PER_COMPARTMENT + i;
			ItemStack held = getStackInSlot(slot);
			boolean holdingEmpty = held.isEmpty();
			if (holdingEmpty || ItemHandlerHelper.canItemStacksStack(stack, held)) {
				int room = holdingEmpty ? stack.getMaxStackSize() : held.getItem().getMaxStackSize() - held.getCount();
				if (room > 0) {
					int insert = Math.min(toInsert, room);
					toInsert -= insert;
					inserted += insert;
					held = holdingEmpty ? stack.copy() : ItemHandlerHelper.copyStackWithSize(held, held.getCount() + insert);
					contentsChangedInternal(slot, held, ctx);
				}
				if (toInsert == 0)
					return ItemStack.EMPTY;
			}
		}

		ItemStack remainder = stack.copy();
		remainder.setCount(toInsert - inserted);
		return remainder;
	}

	public ItemStack takeFromCompartment(int amount, int compartment, TransactionContext ctx) {
		if (amount == 0)
			return ItemStack.EMPTY;

		int remaining = amount;
		ItemStack lastValid = ItemStack.EMPTY;

		updateSnapshots(ctx);
		for (int i = STACKS_PER_COMPARTMENT - 1; i >= 0; i--) {
			int slot = compartment * STACKS_PER_COMPARTMENT + i;
			ItemStack held = getStackInSlot(slot);
			int canExtract = Math.min(remaining, held.getCount());
			ItemStack extracted = held.copy();
			extracted.setCount(canExtract);
			held = held.copy();
			held.shrink(canExtract);
			contentsChangedInternal(slot, held, ctx);
			remaining -= extracted.getCount();
			if (!extracted.isEmpty())
				lastValid = extracted;
			if (remaining == 0)
				return ItemHandlerHelper.copyStackWithSize(lastValid, amount);
		}

		if (remaining == amount)
			return ItemStack.EMPTY;

		return ItemHandlerHelper.copyStackWithSize(lastValid, amount - remaining);
	}

	public static ItemStack cleanItemNBT(ItemStack stack) {
		if (AllItems.BELT_CONNECTOR.isIn(stack))
			stack.removeTagKey("FirstPulley");
		return stack;
	}

	public static boolean canItemsShareCompartment(ItemStack stack1, ItemStack stack2) {
		if (!stack1.isStackable() && !stack2.isStackable() && stack1.isDamageableItem() && stack2.isDamageableItem())
			return stack1.getItem() == stack2.getItem();
		if (AllItems.BELT_CONNECTOR.isIn(stack1) && AllItems.BELT_CONNECTOR.isIn(stack2))
			return true;
		return ItemHandlerHelper.canItemStacksStack(stack1, stack2);
	}

	public static class ToolboxSnapshotData implements ItemStackHandlerSnapshot {
		public final ItemStackHandlerSnapshot base;
		public final List<ItemStack> filters;

		public ToolboxSnapshotData(ItemStackHandlerSnapshot base, List<ItemStack> filters) {
			this.base = base;
			this.filters = filters;
		}

		@Override
		public void apply(ItemStackHandler handler) {
			base.apply(handler);
			((ToolboxInventory) handler).filters = filters;
		}
	}
}
