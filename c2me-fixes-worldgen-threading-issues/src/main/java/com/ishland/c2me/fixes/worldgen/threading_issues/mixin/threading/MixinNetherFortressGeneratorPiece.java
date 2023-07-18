package com.ishland.c2me.fixes.worldgen.threading_issues.mixin.threading;

import com.ishland.c2me.fixes.worldgen.threading_issues.common.INetherFortressGeneratorPieceData;
import net.minecraft.structure.NetherFortressGenerator;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NetherFortressGenerator.Piece.class)
public class MixinNetherFortressGeneratorPiece {

    @Redirect(method = "checkRemainingPieces", at = @At(value = "FIELD", target = "Lnet/minecraft/structure/NetherFortressGenerator$PieceData;generatedCount:I", opcode = Opcodes.GETFIELD))
    private int redirectGetPieceDataGeneratedCount(NetherFortressGenerator.PieceData pieceData) {
        return ((INetherFortressGeneratorPieceData) pieceData).getGeneratedCountAtomic().get();
    }

    @Redirect(method = "pickPiece", at = @At(value = "FIELD", target = "Lnet/minecraft/structure/NetherFortressGenerator$PieceData;generatedCount:I", opcode = Opcodes.PUTFIELD))
    private void redirectIncrementPieceDataGeneratedCount(NetherFortressGenerator.PieceData pieceData, int value) { // TODO Check when updating minecraft version
        ((INetherFortressGeneratorPieceData) pieceData).getGeneratedCountAtomic().incrementAndGet();
    }

}
