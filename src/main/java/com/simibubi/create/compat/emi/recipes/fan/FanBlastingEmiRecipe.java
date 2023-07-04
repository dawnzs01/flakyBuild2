package com.simibubi.create.compat.emi.recipes.fan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.CreateEmiPlugin;
import com.simibubi.create.foundation.gui.element.GuiGameElement;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.level.material.Fluids;

public class FanBlastingEmiRecipe extends FanEmiRecipe<AbstractCookingRecipe> {

	public FanBlastingEmiRecipe(AbstractCookingRecipe recipe) {
		super(CreateEmiPlugin.FAN_BLASTING, recipe);
		ResourceLocation rid = recipe.getId();
		this.id = new ResourceLocation("emi", "create/fan_blasting/" + rid.getNamespace() + "/" + rid.getPath());
	}

	@Override
	protected void renderAttachedBlock(PoseStack matrices) {
		GuiGameElement.of(Fluids.LAVA)
			.scale(SCALE)
			.atLocal(0, 0, 2)
			.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
			.render(matrices);
	}
}
