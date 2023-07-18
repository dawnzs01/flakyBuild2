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
package org.instancio.test.beanvalidation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.instancio.test.support.tags.Feature;
import org.instancio.test.support.tags.FeatureTag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.instancio.test.support.util.Constants.SAMPLE_SIZE_DD;

@FeatureTag(Feature.BEAN_VALIDATION)
@ExtendWith(InstancioExtension.class)
class UnsupportedAnnotationBVTest {

    private static class WithUnsupported {
        @NotNull
        @Pattern(regexp = "^foo$")
        private String value;
    }

    @Test
    void shouldSilentlyIgnoreUnsupportedAnnotation() {
        final Stream<WithUnsupported> result = Instancio.of(WithUnsupported.class)
                .stream()
                .limit(SAMPLE_SIZE_DD);

        assertThat(result)
                .hasSize(SAMPLE_SIZE_DD)
                .allSatisfy(r -> assertThat(r.value).doesNotContain("foo"));
    }
}
