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
package org.jreleaser.gradle.plugin.internal.dsl.announce

import groovy.transform.CompileStatic
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.internal.provider.Providers
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Internal
import org.jreleaser.gradle.plugin.dsl.announce.LinkedinAnnouncer

import javax.inject.Inject

/**
 *
 * @author Andres Almiray
 * @since 1.5.0
 */
@CompileStatic
class LinkedinAnnouncerImpl extends AbstractAnnouncer implements LinkedinAnnouncer {
    final Property<String> owner
    final Property<String> accessToken
    final Property<String> subject
    final Property<String> message
    final RegularFileProperty messageTemplate

    @Inject
    LinkedinAnnouncerImpl(ObjectFactory objects) {
        super(objects)
        owner = objects.property(String).convention(Providers.<String> notDefined())
        accessToken = objects.property(String).convention(Providers.<String> notDefined())
        subject = objects.property(String).convention(Providers.<String> notDefined())
        message = objects.property(String).convention(Providers.<String> notDefined())
        messageTemplate = objects.fileProperty().convention(Providers.notDefined())
    }

    @Override
    void setMessageTemplate(String messageTemplate) {
        this.messageTemplate.set(new File(messageTemplate))
    }

    @Override
    @Internal
    boolean isSet() {
        super.isSet() ||
            owner.present ||
            accessToken.present ||
            subject.present ||
            message.present ||
            messageTemplate.present
    }

    org.jreleaser.model.internal.announce.LinkedinAnnouncer toModel() {
        org.jreleaser.model.internal.announce.LinkedinAnnouncer announcer = new org.jreleaser.model.internal.announce.LinkedinAnnouncer()
        fillProperties(announcer)
        if (owner.present) announcer.owner = owner.get()
        if (accessToken.present) announcer.accessToken = accessToken.get()
        if (subject.present) announcer.subject = subject.get()
        if (message.present) announcer.message = message.get()
        if (messageTemplate.present) {
            announcer.messageTemplate = messageTemplate.asFile.get().absolutePath
        }
        announcer
    }
}
