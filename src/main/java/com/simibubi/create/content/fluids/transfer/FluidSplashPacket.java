package com.simibubi.create.content.fluids.transfer;

import com.simibubi.create.content.fluids.FluidFX;
import com.simibubi.create.foundation.networking.SimplePacketBase;
import io.github.fabricators_of_create.porting_lib.util.FluidStack;
import com.tterrag.registrate.fabric.EnvExecutor;

import net.fabricmc.api.EnvType;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.phys.Vec3;


public class FluidSplashPacket extends SimplePacketBase {

	private BlockPos pos;
	private FluidStack fluid;

	public FluidSplashPacket(BlockPos pos, FluidStack fluid) {
		this.pos = pos;
		this.fluid = fluid;
	}

	public FluidSplashPacket(FriendlyByteBuf buffer) {
		pos = buffer.readBlockPos();
		fluid =FluidStack.fromBuffer(buffer);
	}

	@Override
	public void write(FriendlyByteBuf buffer) {
		buffer.writeBlockPos(pos);
		fluid.toBuffer(buffer);
	}

	@Override
	public boolean handle(Context context) {
		context.enqueueWork(() -> EnvExecutor.runWhenOn(EnvType.CLIENT, () -> () -> {
			if (Minecraft.getInstance().player.position()
				.distanceTo(new Vec3(pos.getX(), pos.getY(), pos.getZ())) > 100)
				return;
			FluidFX.splash(pos, fluid);
		}));
		return true;
	}

}
