ruleset {
    description 'Rules For Gradle Versions Plugin Project'
    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml')
    ruleset('rulesets/design.xml') {
        AbstractClassWithoutAbstractMethod(enabled: false)
    }
    ruleset('rulesets/dry.xml') {
        DuplicateNumberLiteral(enabled: false)
        DuplicateStringLiteral(enabled: false) // too much hassle
        DuplicateListLiteral(enabled: false)
    }
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        ClassJavadoc(enabled: false)
    }
    // generic rules need to be configured to be active and useful
    //ruleset('rulesets/generic.xml')
    IllegalRegex {
        name = 'TODO'
        priority = 2
        regex = /TODO/
        description = 'TODOs should not be commited'
    }

    ruleset('rulesets/groovyism.xml') {
        GetterMethodCouldBeProperty(enabled: false)
    }
    ruleset('rulesets/imports.xml') {
        NoWildcardImports(enabled: false)
    }
    ruleset('rulesets/junit.xml')
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/naming.xml') {
        FactoryMethodName(enabled: false)
        MethodName(enabled: false) // Spock method names
    }
    ruleset('rulesets/security.xml') {
        JavaIoPackageAccess(enabled: false) // gradle uses Java.io.File
    }
    ruleset('rulesets/serialization.xml')
    ruleset('rulesets/size.xml') {
        CrapMetric(enabled: false)
    }
    ruleset('rulesets/unnecessary.xml') {
        UnnecessaryDefInMethodDeclaration(enabled: false)
        UnnecessaryGetter(enabled: false)
        UnnecessaryObjectReferences(enabled: false)
    }
    ruleset('rulesets/unused.xml')
}
