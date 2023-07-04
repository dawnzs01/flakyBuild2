package com.simibubi.create.compat.emi.recipes.basin;

import com.simibubi.create.content.processing.basin.BasinRecipe;

import dev.emi.emi.api.recipe.EmiRecipeCategory;
import net.minecraft.resources.ResourceLocation;

public class ShapelessEmiRecipe extends MixingEmiRecipe {

	public ShapelessEmiRecipe(EmiRecipeCategory category, BasinRecipe recipe) {
		super(category, recipe);
		ResourceLocation id = recipe.getId();
		this.id = new ResourceLocation ("emi", "create/shapeless/" + id.getNamespace() + "/" + id.getPath());
	}
}
