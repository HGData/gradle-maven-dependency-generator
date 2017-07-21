package com.hgdata.gradle.plugin.maven.dependency.generator.reporter

import com.hgdata.gradle.plugin.maven.dependency.generator.reporter.result.Result
import groovy.json.JsonBuilder
import groovy.transform.TupleConstructor
import groovy.transform.TypeChecked

/**
 * A json reporter for the dependency updates results.
 *
 * @author Zenedith (zenedith@wp.pl)
 */
@TypeChecked
@TupleConstructor(callSuper = true, includeSuperProperties = true, includeSuperFields = true)
class JsonReporter extends AbstractReporter {

        def write(printStream, Result result) {
                printStream.println new JsonBuilder(result).toPrettyString().stripMargin()
        }

        @Override
        def getFileName() {
                return 'report.json'
        }
}
