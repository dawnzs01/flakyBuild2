package com.simibubi.create.content.decoration.palettes;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

public class WindowBlock extends ConnectedGlassBlock {

	public WindowBlock(Properties p_i48392_1_) {
		super(p_i48392_1_);
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() instanceof ConnectedGlassBlock
			? (ItemBlockRenderTypes.getChunkRenderType(state) != RenderType.translucent() && side.getAxis()
				.isHorizontal() || state.getBlock() == adjacentBlockState.getBlock())
			: super.skipRendering(state, adjacentBlockState, side);
	}

}
