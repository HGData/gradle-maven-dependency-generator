package com.hgdata.gradle.plugin.maven.dependency.generator.reporter.result

import groovy.transform.TupleConstructor

/**
 * A group of dependencies
 */
@TupleConstructor
class DependenciesGroup<T extends Dependency> {

        /**
         * The number of dependencies in this group
         */
        int count

        /**
         * The dependencies that belong to this group
         */
        SortedSet<T> dependencies = [] as SortedSet<T>
}
