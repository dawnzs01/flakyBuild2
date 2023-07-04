package com.simibubi.create.foundation.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import com.simibubi.create.foundation.block.render.CustomBlockModels;
import com.simibubi.create.foundation.item.render.CustomItemModels;
import com.simibubi.create.foundation.item.render.CustomRenderedItemModel;
import com.simibubi.create.foundation.item.render.CustomRenderedItems;
import io.github.fabricators_of_create.porting_lib.event.client.ModelsBakedCallback;

import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.minecraft.client.renderer.block.BlockModelShaper;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModelSwapper {

	protected CustomBlockModels customBlockModels = new CustomBlockModels();
	protected CustomItemModels customItemModels = new CustomItemModels();

	public CustomBlockModels getCustomBlockModels() {
		return customBlockModels;
	}

	public CustomItemModels getCustomItemModels() {
		return customItemModels;
	}

	public void onModelBake(ModelManager manager, Map<ResourceLocation, BakedModel> modelRegistry, ModelBakery loader) {
		customBlockModels.forEach((block, modelFunc) -> swapModels(modelRegistry, getAllBlockStateModelLocations(block), modelFunc));
		customItemModels.forEach((item, modelFunc) -> swapModels(modelRegistry, getItemModelLocation(item), modelFunc));
		CustomRenderedItems.forEach(item -> swapModels(modelRegistry, getItemModelLocation(item), CustomRenderedItemModel::new));
	}

	public void registerListeners() {
		ModelsBakedCallback.EVENT.register(this::onModelBake);
	}

	public static <T extends BakedModel> void swapModels(Map<ResourceLocation, BakedModel> modelRegistry,
		List<ModelResourceLocation> locations, Function<BakedModel, T> factory) {
		locations.forEach(location -> {
			swapModels(modelRegistry, location, factory);
		});
	}

	public static <T extends BakedModel> void swapModels(Map<ResourceLocation, BakedModel> modelRegistry,
		ModelResourceLocation location, Function<BakedModel, T> factory) {
		modelRegistry.put(location, factory.apply(modelRegistry.get(location)));
	}

	public static List<ModelResourceLocation> getAllBlockStateModelLocations(Block block) {
		List<ModelResourceLocation> models = new ArrayList<>();
		ResourceLocation blockRl = RegisteredObjects.getKeyOrThrow(block);
		block.getStateDefinition()
			.getPossibleStates()
			.forEach(state -> {
				models.add(BlockModelShaper.stateToModelLocation(blockRl, state));
			});
		return models;
	}

	public static ModelResourceLocation getItemModelLocation(Item item) {
		return new ModelResourceLocation(RegisteredObjects.getKeyOrThrow(item), "inventory");
	}

}
