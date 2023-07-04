package com.simibubi.create.compat;

import java.util.Optional;
import java.util.function.Supplier;

import com.simibubi.create.foundation.utility.Lang;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

/**
 * For compatibility with and without another mod present, we have to define load conditions of the specific code
 */
public enum Mods {
	DYNAMICTREES,
	TCONSTRUCT,
	CURIOS,

	COMPUTERCRAFT,
	STORAGEDRAWERS,
	XLPACKETS,

	// fabric mods
	SANDWICHABLE,
	TRINKETS,
	MODMENU,
	BOTANIA,
	SODIUM,
	INDIUM;

	private final boolean loaded;

	Mods() {
		loaded = FabricLoader.getInstance().isModLoaded(asId());
	}

	/**
	 * @return a boolean of whether the mod is loaded or not based on mod id
	 */
	public boolean isLoaded() {
		return loaded;
    }

	/**
	 * @return the mod id
	 */
	public String asId() {
		return Lang.asId(name());
	}

	/**
	 * Simple hook to run code if a mod is installed
	 * @param toRun will be run only if the mod is loaded
	 * @return Optional.empty() if the mod is not loaded, otherwise an Optional of the return value of the given supplier
	 */
	public <T> Optional<T> runIfInstalled(Supplier<Supplier<T>> toRun) {
		if (isLoaded())
			return Optional.of(toRun.get().get());
		return Optional.empty();
	}

	/**
	 * Simple hook to execute code if a mod is installed
	 * @param toExecute will be executed only if the mod is loaded
	 */
	public void executeIfInstalled(Supplier<Runnable> toExecute) {
		if (isLoaded()) {
			toExecute.get().run();
		}
	}

	public Block getBlock(String id) {
		return Registry.BLOCK.get(new ResourceLocation(asId(), id));
	}
}
