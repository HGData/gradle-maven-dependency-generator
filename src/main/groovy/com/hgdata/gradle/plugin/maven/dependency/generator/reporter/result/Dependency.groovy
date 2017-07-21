package com.hgdata.gradle.plugin.maven.dependency.generator.reporter.result

import groovy.transform.Sortable
import groovy.transform.TupleConstructor

/**
 * A project's dependency
 */
@Sortable
@TupleConstructor(includeFields = true)
class Dependency {
        String name
        String group
        String version
}
