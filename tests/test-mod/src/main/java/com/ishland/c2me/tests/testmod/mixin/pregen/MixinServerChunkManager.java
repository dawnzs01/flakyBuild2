package com.ishland.c2me.tests.testmod.mixin.pregen;

import net.minecraft.server.world.ServerChunkManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ServerChunkManager.class)
public class MixinServerChunkManager {

//    @Redirect(method = "tick(Ljava/util/function/BooleanSupplier;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/world/ServerChunkManager;tickChunks()V"))
//    private void redirectTickChunks(ServerChunkManager serverChunkManager) {
//        // no-op
//    }

}
