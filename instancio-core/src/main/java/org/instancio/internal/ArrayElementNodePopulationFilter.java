/*
 * Copyright 2022-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.instancio.internal;

import org.instancio.generator.AfterGenerate;
import org.instancio.internal.nodes.InternalNode;
import org.instancio.internal.util.ReflectionUtils;
import org.jetbrains.annotations.Nullable;

final class ArrayElementNodePopulationFilter implements NodePopulationFilter {

    @Override
    public boolean shouldSkip(final InternalNode node,
                              final AfterGenerate afterGenerate,
                              @Nullable final Object owner) {

        if (afterGenerate == AfterGenerate.POPULATE_NULLS) {
            return node.getRawType().isPrimitive() || owner != null;
        }

        if (afterGenerate == AfterGenerate.POPULATE_NULLS_AND_DEFAULT_PRIMITIVES) {
            return ReflectionUtils.neitherNullNorPrimitiveWithDefaultValue(
                    node.getRawType(),
                    owner);
        }

        return afterGenerate != AfterGenerate.POPULATE_ALL;
    }
}