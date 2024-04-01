import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0-Beta4"
    application
}

group = "io.sebi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1-Beta")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}