package com.hgdata.gradle.plugin.maven.dependency.generator

import org.gradle.api.DefaultTask
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.Dependency
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

final class MavenDependencyGeneratorTask extends DefaultTask {

    @Input
    final String outputDirectoryName

    MavenDependencyGeneratorTask() {
        final projectDir = project.projectDir.path + '/'
        final buildDir = project.buildDir.path

        this.description = 'Generates a Maven POM of plugin and project dependencies.'
        this.group = 'Build'
        this.outputDirectoryName = "${buildDir - projectDir}/mavenDependencyGenerator"
    }

    @SuppressWarnings("GroovyUnusedDeclaration")
    @TaskAction
    void buildPom() {
        project.evaluationDependsOnChildren()
        project.allprojects.collectEntries { final currentProject ->
            final configurationContainers = (currentProject.configurations + currentProject.buildscript.configurations) as Set<ConfigurationContainer>
            configurationContainers.forEach { final ConfigurationContainer configurationContainer ->
                configurationContainer.forEach { final Configuration configuration ->
                    configuration.allDependencies.forEach { final Dependency dependency ->
                        println "${dependency.group}:${dependency.name}:${dependency.version}"
                    }
                }
            }
        }
    }

}
