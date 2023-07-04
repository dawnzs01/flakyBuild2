package com.simibubi.create.content.processing.recipe;

import java.util.Iterator;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

import com.google.common.collect.AbstractIterator;

import io.github.fabricators_of_create.porting_lib.transfer.ViewOnlyWrappedIterator;
import io.github.fabricators_of_create.porting_lib.transfer.ViewOnlyWrappedStorageView;
import io.github.fabricators_of_create.porting_lib.transfer.callbacks.TransactionCallback;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandlerContainer;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;

public class ProcessingInventory extends ItemStackHandlerContainer {
	public float remainingTime;
	public float recipeDuration;
	public boolean appliedRecipe;
	public Consumer<ItemStack> callback;
	private boolean limit;

	public ProcessingInventory(Consumer<ItemStack> callback) {
		super(16);
		this.callback = callback;
	}

	public ProcessingInventory withSlotLimit(boolean limit) {
		this.limit = limit;
		return this;
	}

	@Override
	public int getSlotLimit(int slot) {
		return !limit ? super.getSlotLimit(slot) : 1;
	}

	public void clear() {
		setSize(getSlots());
		remainingTime = 0;
		recipeDuration = 0;
		appliedRecipe = false;
	}

	@Override
	public long insert(ItemVariant resource, long maxAmount, TransactionContext transaction) {
		long inserted = super.insert(resource, maxAmount, transaction);
		if (inserted != 0)
			TransactionCallback.onSuccess(transaction, () -> callback.accept(resource.toStack((int) inserted)));
		return inserted;
	}

	@Override
	public CompoundTag serializeNBT() {
		CompoundTag nbt = super.serializeNBT();
		nbt.putFloat("ProcessingTime", remainingTime);
		nbt.putFloat("RecipeTime", recipeDuration);
		nbt.putBoolean("AppliedRecipe", appliedRecipe);
		return nbt;
	}

	@Override
	public void deserializeNBT(CompoundTag nbt) {
		remainingTime = nbt.getFloat("ProcessingTime");
		recipeDuration = nbt.getFloat("RecipeTime");
		appliedRecipe = nbt.getBoolean("AppliedRecipe");
		super.deserializeNBT(nbt);
		if(isEmpty())
			appliedRecipe = false;
	}

	@Override
	public long extract(ItemVariant resource, long maxAmount, TransactionContext transaction) {
		return 0;
	}

	@Override
	public boolean isItemValid(int slot, ItemVariant resource) {
		return slot == 0 && isEmpty();
	}

	@Override
	public Iterator<StorageView<ItemVariant>> iterator(TransactionContext transaction) {
		return new ViewOnlyWrappedIterator<>(super.iterator(transaction));
	}

	@Override
	public Iterator<? extends StorageView<ItemVariant>> nonEmptyViews() {
		Iterator<? extends StorageView<ItemVariant>> original = super.nonEmptyViews();
		return new AbstractIterator<>() {
			@Nullable
			@Override
			protected StorageView<ItemVariant> computeNext() {
				if (!original.hasNext())
					return endOfData();
				StorageView<ItemVariant> next = original.next();
				return new ViewOnlyWrappedStorageView<>(next);
			}
		};
	}
}
