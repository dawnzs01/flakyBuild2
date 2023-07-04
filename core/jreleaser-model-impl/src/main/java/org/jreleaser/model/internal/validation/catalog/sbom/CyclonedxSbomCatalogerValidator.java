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
package org.jreleaser.model.internal.validation.catalog.sbom;

import org.jreleaser.model.internal.JReleaserContext;
import org.jreleaser.model.internal.catalog.sbom.CyclonedxSbomCataloger;
import org.jreleaser.util.DefaultVersions;
import org.jreleaser.util.Errors;

import static org.jreleaser.model.internal.validation.catalog.sbom.SbomCatalogersValidator.validateSbomCataloger;
import static org.jreleaser.util.StringUtils.isBlank;

/**
 * @author Andres Almiray
 * @since 1.6.0
 */
public final class CyclonedxSbomCatalogerValidator {
    private CyclonedxSbomCatalogerValidator() {
        // noop
    }

    public static void validateCyclonedxSbomCataloger(JReleaserContext context, CyclonedxSbomCataloger sbomCataloger, Errors errors) {
        validateSbomCataloger(context, sbomCataloger, errors);

        if (!sbomCataloger.isEnabled()) return;

        if (isBlank(sbomCataloger.getVersion())) {
            sbomCataloger.setVersion(DefaultVersions.getInstance().getCyclonedxVersion());
        }

        if (sbomCataloger.getFormats().isEmpty()) {
            sbomCataloger.getFormats().add(org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.Format.JSON);
        }
    }
}
