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

package org.quiltmc.loader.api;

import java.util.Collection;

import org.jetbrains.annotations.ApiStatus;
import org.quiltmc.loader.impl.metadata.qmj.ModContributorImpl;

/**
 * A contributor to a mod.
 */
@ApiStatus.NonExtendable
public interface ModContributor {
	static ModContributor of(String name, Collection<String> roles) {
		return new ModContributorImpl(name, roles);
	}

	/**
	 * @return the name of the contributor
	 */
	String name();

	/**
	 * @return the role that represents a contributor's relation to a mod.
	 * @deprecated contributors may have multiple roles, use {@link #roles()} instead.
	 */
	@Deprecated
	String role();

	/**
	 * @return the roles that represent a contributor's relation to a mod.
	 */
	Collection<String> roles();
}
