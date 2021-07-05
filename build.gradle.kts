/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    // google()
    // mavenCentral()

    // jika ingin menggunakan private repository
    // maven {
        // url = uri("https://dl.bintray.com/bliblidotcom/maven")
    // }
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    implementation(project(":belajar-gradle-module"))
    implementation(project(":belajar-gradle-utils"))
}

application {
    // Define the main class for the application.
    mainClassName = "belajar.gradle.AppKt"
}

// perintah" di gradle itu berbasis task
// bisa melihat daftar task pada gradle = gradle tasks --all
// gradle run
// gradle compileKotlin
// gradle classes => untuk melakukan kompilasi build project kode program kita
// gradle test => untuk menjalankan testnya

// gradle distZip   => project akan di bundle menjadi distribusi file
// gradle distTar
    // menjalankannya dengan memanggil main projectnya
    // masuk ke /build/distribution -> unzip belajar-gradle
    // masuk ke folder /belajar-gradle/bin
    // ketik ./belajar-gradle untuk menjalankannya

// custom task build gradle. jalankan dengan command :
// gradle helloworld
tasks.register("helloworld"){
    doFirst {
        println("hello")
    }
    doLast {
        println("world")
    }
}

tasks.register("author"){
    val author: String by project
    val email: String by project
    doLast {
        println("Author $author : Email $email")
    }
}