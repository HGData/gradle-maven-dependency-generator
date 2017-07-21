package com.hgdata.gradle.plugin.maven.dependency.generator.reporter.result

import groovy.transform.TupleConstructor

@TupleConstructor(callSuper = true, includeSuperProperties = true, includeSuperFields = true)
class DependencyLatest extends Dependency {
        String latest
}
