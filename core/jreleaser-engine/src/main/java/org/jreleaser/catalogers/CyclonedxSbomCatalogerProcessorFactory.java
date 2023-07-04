/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2023 The JReleaser authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.catalogers;

import org.jreleaser.model.internal.JReleaserContext;
import org.jreleaser.model.spi.catalog.sbom.SbomCatalogerProcessorFactory;
import org.kordamp.jipsy.annotations.ServiceProviderFor;

/**
 * @author Andres Almiray
 * @since 1.6.0
 */
@ServiceProviderFor(SbomCatalogerProcessorFactory.class)
public class CyclonedxSbomCatalogerProcessorFactory implements SbomCatalogerProcessorFactory<org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger,
    org.jreleaser.model.internal.catalog.sbom.CyclonedxSbomCataloger, CyclonedxSbomCatalogerProcessor> {
    @Override
    public String getName() {
        return org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.TYPE;
    }

    @Override
    public CyclonedxSbomCatalogerProcessor getSbomCataloger(JReleaserContext context) {
        return new CyclonedxSbomCatalogerProcessor(context);
    }
}