package com.hgdata.gradle.plugin.maven.dependency.generator

import org.gradle.api.Plugin
import org.gradle.api.Project

class MavenDependencyGeneratorPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.create('mavenDependencyGenerator', MavenDependencyGeneratorTask)
    }
}
