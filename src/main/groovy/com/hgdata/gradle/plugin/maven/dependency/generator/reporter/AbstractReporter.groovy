package com.hgdata.gradle.plugin.maven.dependency.generator.reporter

import groovy.transform.TupleConstructor
import org.gradle.api.Project

/**
 * A base result object reporter for the dependency updates results.
 *
 * @author Zenedith (zenedith@wp.pl)
 */
@TupleConstructor(includeFields = true)
abstract class AbstractReporter implements Reporter {
        /** The project evaluated against. */
        Project project
        /** The revision strategy evaluated with. */
        String revision
}
