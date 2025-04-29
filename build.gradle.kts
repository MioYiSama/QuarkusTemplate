plugins {
    idea

    kotlin("jvm") version "+"
    kotlin("plugin.serialization") version "+"
    id("io.quarkus") version "+"
}

group = "net.mioyi"
version = "1.0.0"

idea {
    module {
        isDownloadSources = true
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:+"))
    implementation("io.quarkus:quarkus-rest-kotlin-serialization")
    implementation("io.quarkus:quarkus-hibernate-reactive-panache-kotlin")
    implementation("io.quarkus:quarkus-reactive-pg-client")
}