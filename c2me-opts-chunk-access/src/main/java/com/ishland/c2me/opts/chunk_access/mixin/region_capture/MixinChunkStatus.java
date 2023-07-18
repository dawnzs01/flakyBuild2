package com.ishland.c2me.opts.chunk_access.mixin.region_capture;

import com.ishland.c2me.opts.chunk_access.common.CurrentWorldGenState;
import com.mojang.datafixers.util.Either;
import net.minecraft.server.world.ChunkHolder;
import net.minecraft.server.world.ServerLightingProvider;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.util.profiling.jfr.Finishable;
import net.minecraft.util.profiling.jfr.FlightProfiler;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.ProtoChunk;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;

@Mixin(value = ChunkStatus.class, priority = 990)
public abstract class MixinChunkStatus {

    @Shadow @Final private ChunkStatus.GenerationTask generationTask;

    @Shadow public abstract String toString();

    /**
     * @author ishland
     * @reason capture chunk regions
     */
    @Overwrite
    public CompletableFuture<Either<Chunk, ChunkHolder.Unloaded>> runGenerationTask(Executor executor,
                                                                                    ServerWorld world,
                                                                                    ChunkGenerator generator,
                                                                                    StructureTemplateManager structureTemplateManager,
                                                                                    ServerLightingProvider lightingProvider,
                                                                                    Function<Chunk, CompletableFuture<Either<Chunk, ChunkHolder.Unloaded>>> fullChunkConverter,
                                                                                    List<Chunk> chunks) {
        try {
            final ChunkStatus thiz = (ChunkStatus) (Object) this;
            CurrentWorldGenState.setCurrentRegion(new ChunkRegion(world,chunks, thiz, -1));
            Chunk chunk = chunks.get(chunks.size() / 2);
            Finishable finishable = FlightProfiler.INSTANCE.startChunkGenerationProfiling(chunk.getPos(), world.getRegistryKey(), this.toString());
            CompletableFuture<Either<Chunk, ChunkHolder.Unloaded>> completableFuture = this.generationTask.doWork(thiz, executor, world, generator, structureTemplateManager, lightingProvider, fullChunkConverter, chunks, chunk);
            return completableFuture.thenApply((either) -> {
                if (chunk instanceof ProtoChunk protoChunk && !protoChunk.getStatus().isAtLeast(thiz)) {
                    protoChunk.setStatus(thiz);
                }

                if (finishable != null) {
                    finishable.finish();
                }
                return either;
            });
        } finally {
            CurrentWorldGenState.clearCurrentRegion();
        }
    }

}
