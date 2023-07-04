package com.simibubi.create.content.kinetics.simpleRelays;

import java.util.Random;
import java.util.function.Supplier;

import com.jozufozu.flywheel.core.virtual.VirtualEmptyBlockGetter;
import com.simibubi.create.content.decoration.bracket.BracketedBlockEntityBehaviour;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;

import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;

public class BracketedKineticBlockModel extends ForwardingBakedModel {

	public BracketedKineticBlockModel(BakedModel template) {
		wrapped = template;
	}

	@Override
	public boolean isVanillaAdapter() {
		return false;
	}

	@Override
	public void emitBlockQuads(BlockAndTintGetter blockView, BlockState state, BlockPos pos, Supplier<Random> randomSupplier, RenderContext context) {
		if (!VirtualEmptyBlockGetter.is(blockView)) {
			BracketedModelData data = new BracketedModelData();
			BracketedBlockEntityBehaviour attachmentBehaviour =
				BlockEntityBehaviour.get(blockView, pos, BracketedBlockEntityBehaviour.TYPE);
			if (attachmentBehaviour != null)
				data.putBracket(attachmentBehaviour.getBracket());

			BakedModel bracket = data.getBracket();
			if (bracket != null)
				((FabricBakedModel) bracket).emitBlockQuads(blockView, state, pos, randomSupplier, context);
			return;
		}
		super.emitBlockQuads(blockView, state, pos, randomSupplier, context);
	}

	private static class BracketedModelData {
		private BakedModel bracket;

		public void putBracket(BlockState state) {
			if (state != null) {
				this.bracket = Minecraft.getInstance()
					.getBlockRenderer()
					.getBlockModel(state);
			}
		}

		public BakedModel getBracket() {
			return bracket;
		}
	}

}
