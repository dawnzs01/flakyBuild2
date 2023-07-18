/*
 * Copyright 2016 FabricMC
 * Copyright 2022-2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.loader.impl.entrypoint;

import java.util.function.Supplier;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.entrypoint.EntrypointContainer;
import org.quiltmc.loader.impl.util.QuiltLoaderInternal;
import org.quiltmc.loader.impl.util.QuiltLoaderInternalType;

@QuiltLoaderInternal(QuiltLoaderInternalType.LEGACY_EXPOSED)
public class EntrypointContainerImpl<T> implements EntrypointContainer<T> {
	private final ModContainer container;
	private final Supplier<T> entrypointSupplier;
	private T instance;

	/**
	 * Create EntrypointContainer with lazy init.
	 */
	public EntrypointContainerImpl(ModContainer container, Supplier<T> entrypointSupplier) {
		this.container = container;
		this.entrypointSupplier = entrypointSupplier;
	}

	/**
	 * Create EntrypointContainer without lazy init.
	 */
	public EntrypointContainerImpl(ModContainer container, T instance) {
		this.container = container;
		this.entrypointSupplier = null;
		this.instance = instance;
	}

	@SuppressWarnings("deprecation")
	@Override
	public synchronized T getEntrypoint() {
		if (instance == null) {
			this.instance = entrypointSupplier.get();
		}

		return instance;
	}

	@Override
	public ModContainer getProvider() {
		return container;
	}
}
