package com.ishland.c2me.base.mixin.theinterface;

import com.ishland.c2me.base.common.theinterface.IDirectStorage;
import com.ishland.c2me.base.mixin.access.IRegionBasedStorage;
import com.mojang.datafixers.util.Either;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.storage.RegionBasedStorage;
import net.minecraft.world.storage.RegionFile;
import net.minecraft.world.storage.StorageIoWorker;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@Mixin(StorageIoWorker.class)
public abstract class MixinStorageIoWorker implements IDirectStorage {


    @Shadow protected abstract <T> CompletableFuture<T> run(Supplier<Either<T, Exception>> task);

    @Shadow @Final private Map<ChunkPos, StorageIoWorker.Result> results;

    @Shadow protected abstract void write(ChunkPos pos, StorageIoWorker.Result result);

    @Shadow @Final private RegionBasedStorage storage;

    @Override
    public CompletableFuture<Void> setRawChunkData(ChunkPos pos, byte[] data) {
        return this.run(() -> {
            StorageIoWorker.Result result = this.results.get(pos);
            try {
                final RegionFile regionFile = ((IRegionBasedStorage) (Object) this.storage).invokeGetRegionFile(pos);
                try (final DataOutputStream out = regionFile.getChunkOutputStream(pos)) {
                    out.write(data);
                }
                if (result != null) result.future.complete(null);
            } catch (IOException e) {
                return Either.right(e);
            }
            return Either.left(null);
        });
    }

}
