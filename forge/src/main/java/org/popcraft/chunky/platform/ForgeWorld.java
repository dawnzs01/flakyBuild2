package org.popcraft.chunky.platform;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.TicketType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Unit;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.storage.LevelResource;
import org.popcraft.chunky.ChunkyForge;
import org.popcraft.chunky.platform.util.Location;
import org.popcraft.chunky.util.Input;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class ForgeWorld implements World {
    private static final int TICKING_LOAD_DURATION = Input.tryInteger(System.getProperty("chunky.tickingLoadDuration")).orElse(0);
    private static final TicketType<Unit> CHUNKY = TicketType.create(ChunkyForge.MOD_ID, (unit, unit2) -> 0);
    private static final TicketType<Unit> CHUNKY_TICKING = TicketType.create("%s_ticking".formatted(ChunkyForge.MOD_ID), (unit, unit2) -> 0, TICKING_LOAD_DURATION * 20);
    private final ServerLevel world;
    private final Border worldBorder;

    public ForgeWorld(final ServerLevel world) {
        this.world = world;
        this.worldBorder = new ForgeBorder(world.getWorldBorder());
    }

    @Override
    public String getName() {
        return world.dimension().location().toString();
    }

    @Override
    public String getKey() {
        return getName();
    }

    @Override
    public CompletableFuture<Boolean> isChunkGenerated(final int x, final int z) {
        if (Thread.currentThread() != world.getServer().getRunningThread()) {
            return CompletableFuture.supplyAsync(() -> isChunkGenerated(x, z), world.getServer()).join();
        } else {
            final ChunkPos chunkPos = new ChunkPos(x, z);
            final ChunkMap chunkStorage = world.getChunkSource().chunkMap;
            final ChunkHolder loadedChunkHolder = chunkStorage.getVisibleChunkIfPresent(chunkPos.toLong());
            if (loadedChunkHolder != null && loadedChunkHolder.getLastAvailableStatus() == ChunkStatus.FULL) {
                return CompletableFuture.completedFuture(true);
            }
            final ChunkHolder unloadedChunkHolder = chunkStorage.pendingUnloads.get(chunkPos.toLong());
            if (unloadedChunkHolder != null && unloadedChunkHolder.getLastAvailableStatus() == ChunkStatus.FULL) {
                return CompletableFuture.completedFuture(true);
            }
            return chunkStorage.readChunk(chunkPos)
                    .thenApply(optionalNbt -> optionalNbt
                            .filter(chunkNbt -> chunkNbt.contains("Status", 8))
                            .map(chunkNbt -> chunkNbt.getString("Status"))
                            .map(status -> "minecraft:full".equals(status) || "full".equals(status))
                            .orElse(false));
        }
    }

    @Override
    public CompletableFuture<Void> getChunkAtAsync(final int x, final int z) {
        if (Thread.currentThread() != world.getServer().getRunningThread()) {
            return CompletableFuture.supplyAsync(() -> getChunkAtAsync(x, z), world.getServer()).join();
        } else {
            final ChunkPos chunkPos = new ChunkPos(x, z);
            final ServerChunkCache serverChunkCache = world.getChunkSource();
            serverChunkCache.addRegionTicket(CHUNKY, chunkPos, 0, Unit.INSTANCE);
            if (TICKING_LOAD_DURATION > 0) {
                serverChunkCache.addRegionTicket(CHUNKY_TICKING, chunkPos, 1, Unit.INSTANCE);
            }
            serverChunkCache.runDistanceManagerUpdates();
            final ChunkMap chunkManager = serverChunkCache.chunkMap;
            final ChunkHolder chunkHolder = chunkManager.getVisibleChunkIfPresent(chunkPos.toLong());
            final CompletableFuture<Void> chunkFuture = chunkHolder == null ? CompletableFuture.completedFuture(null) : CompletableFuture.allOf(chunkHolder.getOrScheduleFuture(ChunkStatus.FULL, chunkManager));
            chunkFuture.whenCompleteAsync((ignored, throwable) -> serverChunkCache.removeRegionTicket(CHUNKY, chunkPos, 0, Unit.INSTANCE), world.getServer());
            return chunkFuture;
        }
    }

    @Override
    public UUID getUUID() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSeaLevel() {
        return world.getSeaLevel();
    }

    @Override
    public Location getSpawn() {
        final BlockPos pos = world.getSharedSpawnPos();
        final float rot = world.getSharedSpawnAngle();
        return new Location(this, pos.getX(), pos.getY(), pos.getZ(), rot, 0);
    }

    @Override
    public Border getWorldBorder() {
        return worldBorder;
    }

    @Override
    public int getElevation(final int x, final int z) {
        final int height = world.getHeight(Heightmap.Types.MOTION_BLOCKING, x, z) + 1;
        final int logicalHeight = world.getLogicalHeight();
        if (height >= logicalHeight) {
            BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(x, logicalHeight, z);
            int air = 0;
            while (pos.getY() > world.getMinBuildHeight()) {
                pos = pos.move(Direction.DOWN);
                final BlockState blockState = world.getBlockState(pos);
                if (blockState.isSolid() && air > 1) {
                    return pos.getY() + 1;
                }
                air = blockState.isAir() ? air + 1 : 0;
            }
        }
        return height;
    }

    @Override
    public int getMaxElevation() {
        return world.getLogicalHeight();
    }

    @Override
    public void playEffect(final Player player, final String effect) {
        final Location location = player.getLocation();
        final BlockPos pos = BlockPos.containing(location.getX(), location.getY(), location.getZ());
        Input.tryInteger(effect).ifPresent(eventId -> world.levelEvent(eventId, pos, 0));
    }

    @Override
    public void playSound(final Player player, final String sound) {
        final Location location = player.getLocation();
        world.getServer()
                .registryAccess()
                .registry(Registries.SOUND_EVENT)
                .flatMap(soundEventRegistry -> soundEventRegistry.getOptional(ResourceLocation.tryParse(sound)))
                .ifPresent(soundEvent -> world.playSound(null, location.getX(), location.getY(), location.getZ(), soundEvent, SoundSource.MASTER, 2f, 1f));
    }

    @Override
    public Optional<Path> getDirectory(final String name) {
        if (name == null) {
            return Optional.empty();
        }
        final Path directory = DimensionType.getStorageFolder(world.dimension(), world.getServer().getWorldPath(LevelResource.ROOT)).normalize().resolve(name);
        return Files.exists(directory) ? Optional.of(directory) : Optional.empty();
    }

    public ServerLevel getWorld() {
        return world;
    }
}
