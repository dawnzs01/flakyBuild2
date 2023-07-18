package com.ishland.c2me.client.uncapvd.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SimpleOption.class)
public interface ISimpleOption<T> {

    @Accessor
    @Mutable
    void setCallbacks(SimpleOption.Callbacks<T> callbacks);

    @Accessor
    @Mutable
    void setCodec(Codec<T> codec);

}
