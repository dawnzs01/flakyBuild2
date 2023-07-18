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

import org.jetbrains.annotations.ApiStatus;

/** A displayable icon that can be shown in {@link QuiltLoaderGui} related elements. These are created from
 * {@link QuiltLoaderGui#createIcon(java.awt.image.BufferedImage)} (and related methods). */
@ApiStatus.NonExtendable
public interface QuiltLoaderIcon {

	/** Returns a new icon with a sub-icon added to this main icon. The given sub-icon must not already have sub-icons.
	 * If the given sub-icon is null then this is returned. */
	QuiltLoaderIcon withDecoration(QuiltLoaderIcon subIcon);
}
