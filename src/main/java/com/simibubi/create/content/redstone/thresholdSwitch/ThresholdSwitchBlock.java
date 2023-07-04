package com.simibubi.create.content.redstone.thresholdSwitch;

import java.util.Random;

import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.redstone.DirectedDirectionalBlock;
import com.simibubi.create.foundation.block.IBE;
import com.simibubi.create.foundation.gui.ScreenOpener;
import com.tterrag.registrate.fabric.EnvExecutor;

import io.github.fabricators_of_create.porting_lib.block.ConnectableRedstoneBlock;
import io.github.fabricators_of_create.porting_lib.transfer.TransferUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;

public class ThresholdSwitchBlock extends DirectedDirectionalBlock implements IBE<ThresholdSwitchBlockEntity>, ConnectableRedstoneBlock {

	public static final IntegerProperty LEVEL = IntegerProperty.create("level", 0, 5);

	public ThresholdSwitchBlock(Properties p_i48377_1_) {
		super(p_i48377_1_);
	}

	@Override
	public void onPlace(BlockState state, Level worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		updateObservedInventory(state, worldIn, pos);
	}

	private void updateObservedInventory(BlockState state, LevelReader world, BlockPos pos) {
		withBlockEntityDo(world, pos, ThresholdSwitchBlockEntity::updateCurrentLevel);
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return side != null && side.getOpposite() != state.getValue(FACING);
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
		if (side == blockState.getValue(FACING)
			.getOpposite())
			return 0;
		return getBlockEntityOptional(blockAccess, pos).filter(ThresholdSwitchBlockEntity::isPowered)
			.map($ -> 15)
			.orElse(0);
	}

	@Override
	public void tick(BlockState blockState, ServerLevel world, BlockPos pos, Random random) {
		getBlockEntityOptional(world, pos).ifPresent(ThresholdSwitchBlockEntity::updatePowerAfterDelay);
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder.add(LEVEL));
	}

	@Override
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn,
		BlockHitResult hit) {
		if (player != null && AllItems.WRENCH.isIn(player.getItemInHand(handIn)))
			return InteractionResult.PASS;
		EnvExecutor.runWhenOn(EnvType.CLIENT,
			() -> () -> withBlockEntityDo(worldIn, pos, be -> this.displayScreen(be, player)));
		return InteractionResult.SUCCESS;
	}

	@Environment(value = EnvType.CLIENT)
	protected void displayScreen(ThresholdSwitchBlockEntity be, Player player) {
		if (player instanceof LocalPlayer)
			ScreenOpener.open(new ThresholdSwitchScreen(be));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = defaultBlockState();

		Direction preferredFacing = null;
		for (Direction face : context.getNearestLookingDirections()) {
			BlockPos offsetPos = context.getClickedPos().relative(face);
			Level world = context.getLevel();
			if (TransferUtil.getItemStorage(world, offsetPos, face.getOpposite()) != null
					|| TransferUtil.getFluidStorage(world, offsetPos, face.getOpposite()) != null) {
				preferredFacing = face;
				break;
			}
		}

		if (preferredFacing == null) {
			Direction facing = context.getNearestLookingDirection();
			preferredFacing = context.getPlayer() != null && context.getPlayer()
				.isSteppingCarefully() ? facing : facing.getOpposite();
		}

		if (preferredFacing.getAxis() == Axis.Y) {
			state = state.setValue(TARGET, preferredFacing == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR);
			preferredFacing = context.getHorizontalDirection();
		}

		return state.setValue(FACING, preferredFacing);
	}

	@Override
	public Class<ThresholdSwitchBlockEntity> getBlockEntityClass() {
		return ThresholdSwitchBlockEntity.class;
	}

	@Override
	public BlockEntityType<? extends ThresholdSwitchBlockEntity> getBlockEntityType() {
		return AllBlockEntityTypes.THRESHOLD_SWITCH.get();
	}

}
