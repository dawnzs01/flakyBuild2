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

package org.quiltmc.loader.impl.util.log;

import org.quiltmc.loader.impl.util.QuiltLoaderInternal;
import org.quiltmc.loader.impl.util.QuiltLoaderInternalType;

@QuiltLoaderInternal(QuiltLoaderInternalType.LEGACY_EXPOSED)
public final class LogCategory {
	public static final LogCategory CACHE = create("Cache");
	public static final LogCategory CHASM = create("Chasm");
	public static final LogCategory CONFIG = create("Config");
	public static final LogCategory DISCOVERY = create("Discovery");
	public static final LogCategory ENTRYPOINT = create("Entrypoint");
	public static final LogCategory GAME_PATCH = create("GamePatch");
	public static final LogCategory GAME_PROVIDER = create("GameProvider");
	public static final LogCategory GAME_REMAP = create("GameRemap");
	public static final LogCategory GENERAL = create();
	public static final LogCategory GUI = create("GUI");
	public static final LogCategory KNOT = create("Knot");
	public static final LogCategory LIB_CLASSIFICATION = create("LibClassify");
	public static final LogCategory LOG = create("Log");
	public static final LogCategory MAPPINGS = create("Mappings");
	public static final LogCategory METADATA = create("Metadata");
	public static final LogCategory MOD_REMAP = create("ModRemap");
	public static final LogCategory MIXIN = create("Mixin");
	public static final LogCategory SOLVING = create("Solving");
	public static final LogCategory TEST = create("Test");
	public static final LogCategory COMMS = create("Comms");

	public static final String SEPARATOR = "/";

	public final String context;
	public final String name;
	public Object data;

	public static LogCategory create(String... names) {
		return new LogCategory(Log.NAME, names);
	}

	/**
	 * Create a log category for external uses, no API guarantees!
	 */
	public static LogCategory createCustom(String context, String... names) {
		return new LogCategory(context, names);
	}

	private LogCategory(String context, String[] names) {
		this.context = context;
		this.name = String.join(SEPARATOR, names);
	}

	@Override
	public String toString() {
		return name.isEmpty() ? context : context+SEPARATOR+name;
	}
}
