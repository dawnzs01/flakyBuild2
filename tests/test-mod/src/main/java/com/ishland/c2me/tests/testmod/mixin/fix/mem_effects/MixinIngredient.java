package com.ishland.c2me.tests.testmod.mixin.fix.mem_effects;

import net.minecraft.recipe.Ingredient;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Ingredient.class)
public abstract class MixinIngredient {

//    @Shadow protected abstract void cacheMatchingStacks();
//
//    @Shadow private ItemStack[] matchingStacks;
//
//    /**
//     * @author ishland
//     * @reason add synchronize to prevent memory effect issues
//     */
//    @Overwrite
//    public ItemStack[] getMatchingStacks() {
//        synchronized (this) {
//            this.cacheMatchingStacks();
//            return this.matchingStacks;
//        }
//    }

}
