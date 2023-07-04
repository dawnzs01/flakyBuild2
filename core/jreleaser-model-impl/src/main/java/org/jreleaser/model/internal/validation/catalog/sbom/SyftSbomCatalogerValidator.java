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
import org.jreleaser.model.internal.catalog.sbom.SyftSbomCataloger;
import org.jreleaser.util.DefaultVersions;
import org.jreleaser.util.Errors;

import static org.jreleaser.model.internal.validation.catalog.sbom.SbomCatalogersValidator.validateSbomCataloger;
import static org.jreleaser.util.StringUtils.isBlank;

/**
 * @author Andres Almiray
 * @since 1.5.0
 */
public final class SyftSbomCatalogerValidator {
    private SyftSbomCatalogerValidator() {
        // noop
    }

    public static void validateSyftSbomCataloger(JReleaserContext context, SyftSbomCataloger sbomCataloger, Errors errors) {
        validateSbomCataloger(context, sbomCataloger, errors);

        if (!sbomCataloger.isEnabled()) return;

        if (isBlank(sbomCataloger.getVersion())) {
            sbomCataloger.setVersion(DefaultVersions.getInstance().getSyftVersion());
        }

        if (sbomCataloger.getFormats().isEmpty()) {
            sbomCataloger.getFormats().add(org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.Format.SPDX_JSON);
        }
    }
}
