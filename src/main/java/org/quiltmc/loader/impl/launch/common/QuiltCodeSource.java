/*
 * Copyright 2022, 2023 QuiltMC
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

package org.quiltmc.loader.impl.launch.common;

import java.security.CodeSource;
import java.util.Optional;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.loader.impl.util.QuiltLoaderInternal;
import org.quiltmc.loader.impl.util.QuiltLoaderInternalType;

/** For {@link CodeSource}s. */
@QuiltLoaderInternal(QuiltLoaderInternalType.LEGACY_EXPOSED)
public interface QuiltCodeSource {
	/** @return The mod that contains this class. (This is used to implement
	 *         {@link QuiltLoader#getModContainer(Class)}). */
	Optional<ModContainer> getQuiltMod();
}
