/*
 * Copyright 2012-2014 Ben Manes. All Rights Reserved.
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
package com.hgdata.gradle.plugin.maven.dependency.generator

import com.hgdata.gradle.plugin.maven.dependency.generator.updates.DependencyUpdatesTask
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Registers the plugin's tasks.
 *
 * @author Ben Manes (ben.manes@gmail.com)
 */
class MavenDependencyGeneratorPlugin implements Plugin<Project> {

        @Override
        void apply(Project project) {
                try {
                        project.tasks.create('dependencyUpdates', DependencyUpdatesTask)
                } catch (MissingMethodException e) {
                        // Maybe we're running with an old Gradle version, let's try tasks.add
                        project.tasks.add('dependencyUpdates', DependencyUpdatesTask)
                }
        }
}
