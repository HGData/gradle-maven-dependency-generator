# Gradle Maven Dependency Generator plugin

Generates a POM file containing all plugin and project dependencies.

## Usage

### `plugins` block:

```groovy
plugins {
  id 'com.hgata.gradle-maven-dependency-generator' version '0.1.0'
}
```
or via the

### `buildscript` block:
```groovy
apply plugin: 'com.hgata.gradle-maven-dependency-generator'

buildscript {
  dependencies {
    classpath 'com.hgata.gradle-maven-dependency-generator:0.1.0'
  }
}
```

## Tasks

### `mavenGenerateDependenciesPom`

Builds a POM in build/mavenDependencies/pom.xml
