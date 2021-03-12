/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("com.github.dcendents.android-maven") version "2.1"


    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

group = "com.github.jitpack"
version = "0.0.2"
repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    google()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
    maven { url = uri("https://jitpack.io") }

}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("com.github.dcendents:android-maven-gradle-plugin:2.1"))


    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
