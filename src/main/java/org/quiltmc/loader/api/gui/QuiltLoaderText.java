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

package org.quiltmc.loader.api.gui;

import org.quiltmc.loader.impl.gui.QuiltLoaderTextImpl;

/** Text class for translating text into whatever language the user has selected. Currently only quilt-loader language
 * entries are supported, but this will expand in the future to allow loading language entries from mods too. */
public interface QuiltLoaderText {
	public static final QuiltLoaderText EMPTY = new QuiltLoaderTextImpl("", false);

	public static QuiltLoaderText translate(String translationKey, Object... extra) {
		return new QuiltLoaderTextImpl(translationKey, true, extra);
	}

	public static QuiltLoaderText of(String text) {
		return new QuiltLoaderTextImpl(text, false);
	}
}
