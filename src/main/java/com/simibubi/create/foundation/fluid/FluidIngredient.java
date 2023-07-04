package com.simibubi.create.foundation.fluid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.simibubi.create.foundation.utility.RegisteredObjects;

import io.github.fabricators_of_create.porting_lib.util.FluidStack;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

public abstract class FluidIngredient implements Predicate<FluidStack> {

	public static final FluidIngredient EMPTY = new FluidStackIngredient();

	public List<FluidStack> matchingFluidStacks;

	public static FluidIngredient fromTag(TagKey<Fluid> tag, long amount) {
		FluidTagIngredient ingredient = new FluidTagIngredient();
		ingredient.tag = tag;
		ingredient.amountRequired = amount;
		return ingredient;
	}

	public static FluidIngredient fromFluid(Fluid fluid, long amount) {
		FluidStackIngredient ingredient = new FluidStackIngredient();
		ingredient.fluid = fluid;
		ingredient.amountRequired = amount;
		ingredient.fixFlowing();
		return ingredient;
	}

	public static FluidIngredient fromFluidStack(FluidStack fluidStack) {
		FluidStackIngredient ingredient = new FluidStackIngredient();
		ingredient.fluid = fluidStack.getFluid();
		ingredient.amountRequired = fluidStack.getAmount();
		ingredient.fixFlowing();
		if (fluidStack.hasTag())
			ingredient.tagToMatch = fluidStack.getTag();
		return ingredient;
	}

	protected long amountRequired;

	protected abstract boolean testInternal(FluidStack t);

	protected abstract void readInternal(FriendlyByteBuf buffer);

	protected abstract void writeInternal(FriendlyByteBuf buffer);

	protected abstract void readInternal(JsonObject json);

	protected abstract void writeInternal(JsonObject json);

	protected abstract List<FluidStack> determineMatchingFluidStacks();

	public long getRequiredAmount() {
		return amountRequired;
	}

	public List<FluidStack> getMatchingFluidStacks() {
		if (matchingFluidStacks != null)
			return matchingFluidStacks;
		return matchingFluidStacks = determineMatchingFluidStacks();
	}

	@Override
	public boolean test(FluidStack t) {
		if (t == null)
			throw new IllegalArgumentException("FluidStack cannot be null");
		return testInternal(t);
	}

	public void write(FriendlyByteBuf buffer) {
		buffer.writeBoolean(this instanceof FluidTagIngredient);
		buffer.writeVarLong(amountRequired);
		writeInternal(buffer);
	}

	public static FluidIngredient read(FriendlyByteBuf buffer) {
		boolean isTagIngredient = buffer.readBoolean();
		FluidIngredient ingredient = isTagIngredient ? new FluidTagIngredient() : new FluidStackIngredient();
		ingredient.amountRequired = buffer.readVarLong();
		ingredient.readInternal(buffer);
		return ingredient;
	}

	public JsonObject serialize() {
		JsonObject json = new JsonObject();
		writeInternal(json);
		json.addProperty("amount", amountRequired);
		return json;
	}

	public static boolean isFluidIngredient(@Nullable JsonElement je) {
		if (je == null || je.isJsonNull())
			return false;
		if (!je.isJsonObject())
			return false;
		JsonObject json = je.getAsJsonObject();
		if (json.has("fluidTag"))
			return true;
		else if (json.has("fluid"))
			return true;
		return false;
	}

	public static FluidIngredient deserialize(@Nullable JsonElement je) {
		if (!isFluidIngredient(je))
			throw new JsonSyntaxException("Invalid fluid ingredient: " + Objects.toString(je));

		JsonObject json = je.getAsJsonObject();
		FluidIngredient ingredient = json.has("fluidTag") ? new FluidTagIngredient() : new FluidStackIngredient();
		ingredient.readInternal(json);

		if (!json.has("amount"))
			throw new JsonSyntaxException("Fluid ingredient has to define an amount");
		ingredient.amountRequired = GsonHelper.getAsInt(json, "amount");
		return ingredient;
	}

	public static class FluidStackIngredient extends FluidIngredient {

		protected Fluid fluid;
		protected CompoundTag tagToMatch;

		public FluidStackIngredient() {
			tagToMatch = new CompoundTag();
		}

		void fixFlowing() {
			if (fluid instanceof FlowingFluid)
				fluid = ((FlowingFluid) fluid).getSource();
		}

		@Override
		protected boolean testInternal(FluidStack t) {
			if (!t.getFluid()
				.isSame(fluid))
				return false;
			if (tagToMatch.isEmpty())
				return true;
			CompoundTag tag = t.getOrCreateTag();
			return tag.copy()
				.merge(tagToMatch)
				.equals(tag);
		}

		@Override
		protected void readInternal(FriendlyByteBuf buffer) {
			fluid = Registry.FLUID.get(buffer.readResourceLocation());
			tagToMatch = buffer.readNbt();
		}

		@Override
		protected void writeInternal(FriendlyByteBuf buffer) {
			buffer.writeResourceLocation(Registry.FLUID.getKey(fluid));
			buffer.writeNbt(tagToMatch);
		}

		@Override
		protected void readInternal(JsonObject json) {
			FluidStack stack = FluidHelper.deserializeFluidStack(json);
			fluid = stack.getFluid();
			tagToMatch = stack.getOrCreateTag();
		}

		@Override
		protected void writeInternal(JsonObject json) {
			json.addProperty("fluid", RegisteredObjects.getKeyOrThrow(fluid)
				.toString());
			json.add("nbt", JsonParser.parseString(tagToMatch.toString()));
		}

		@Override
		protected List<FluidStack> determineMatchingFluidStacks() {
			return ImmutableList.of(tagToMatch.isEmpty() ? new FluidStack(fluid, amountRequired)
				: new FluidStack(FluidVariant.of(fluid, tagToMatch), amountRequired, tagToMatch));
		}

	}

	public static class FluidTagIngredient extends FluidIngredient {

		protected TagKey<Fluid> tag;

		@SuppressWarnings("deprecation")
		@Override
		protected boolean testInternal(FluidStack t) {
			if (tag == null) {
				for (FluidStack accepted : getMatchingFluidStacks())
					if (accepted.getFluid()
						.isSame(t.getFluid()))
						return true;
				return false;
			}
			return t.getFluid().is(tag);
		}

		@Override
		protected void readInternal(FriendlyByteBuf buffer) {
			int size = buffer.readVarInt();
			matchingFluidStacks = new ArrayList<>(size);
			for (int i = 0; i < size; i++)
				matchingFluidStacks.add(FluidStack.fromBuffer(buffer));
		}

		@Override
		protected void writeInternal(FriendlyByteBuf buffer) {
			// Tag has to be resolved on the server before sending
			List<FluidStack> matchingFluidStacks = getMatchingFluidStacks();
			buffer.writeVarInt(matchingFluidStacks.size());
			matchingFluidStacks.stream()
				.forEach(stack -> stack.toBuffer(buffer));
		}

		@Override
		protected void readInternal(JsonObject json) {
			ResourceLocation name = new ResourceLocation(GsonHelper.getAsString(json, "fluidTag"));
			tag = TagKey.create(Registry.FLUID_REGISTRY, name);
		}

		@Override
		protected void writeInternal(JsonObject json) {
			json.addProperty("fluidTag", tag.location()
				.toString());
		}

		@Override
		protected List<FluidStack> determineMatchingFluidStacks() {
			List<FluidStack> stacks = new ArrayList<>();
			for (Holder<Fluid> holder : Registry.FLUID.getTagOrEmpty(tag)) {
				Fluid f = holder.value();
				if (f instanceof FlowingFluid flowing) f = flowing.getSource();
				stacks.add(new FluidStack(f, amountRequired));
			}
			return stacks;
		}

	}

}
