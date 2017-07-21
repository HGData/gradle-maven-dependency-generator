package com.hgdata.gradle.plugin.maven.dependency.generator.reporter.result

import groovy.transform.TupleConstructor

@TupleConstructor
class VersionAvailable {
        String release
        String milestone
        String integration
}
