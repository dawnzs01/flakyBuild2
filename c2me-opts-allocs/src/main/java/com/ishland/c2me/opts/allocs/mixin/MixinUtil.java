package com.ishland.c2me.opts.allocs.mixin;

import com.ibm.asyncutil.util.Combinators;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Mixin(Util.class)
public abstract class MixinUtil {

    /**
     * @author ishland
     * @reason use another impl
     */
    @Overwrite
    public static <V> CompletableFuture<List<V>> combineSafe(List<CompletableFuture<V>> futures) {
        return Combinators.collect(futures, Collectors.toList()).toCompletableFuture();
    }

    /**
     * @author ishland
     * @reason use another impl
     */
    @Overwrite
    public static <V> CompletableFuture<List<V>> combine(List<CompletableFuture<V>> futures) {
        final CompletableFuture<List<V>> future = Combinators.collect(futures, Collectors.toList()).toCompletableFuture();
        CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new)).exceptionally(e -> {
            future.completeExceptionally(e);
            return null;
        });
        return future;
    }

    /**
     * @author ishland
     * @reason use another impl
     */
    @Overwrite
    public static <V> CompletableFuture<List<V>> combineCancellable(List<CompletableFuture<V>> futures) {
        final CompletableFuture<List<V>> future = Combinators.collect(futures, Collectors.toList()).toCompletableFuture();
        CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new)).exceptionally(e -> {
            future.completeExceptionally(e);
            futures.forEach(f -> f.cancel(false));
            return null;
        });
        return future;
    }

}
