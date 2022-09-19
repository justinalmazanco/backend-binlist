plugins {
    kotlin("jvm") version "1.7.10"
    kotlin("plugin.allopen") version "1.7.10"
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    /**
     * Kotlin (to use kotlin)
     */
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    /**
     * Dependency Injecction (default)
     */
    implementation("io.quarkus:quarkus-arc")
    /**
     * Vert.x (routing)
     */
    implementation("io.quarkus:quarkus-vertx")
    implementation("io.quarkus:quarkus-vertx-web")
    /**
     * Container Image (build img)
     */
    implementation("io.quarkus:quarkus-container-image-jib")
    /**
     * Kubernetes (gen yaml file - app properties declare; switch to linux to gen yaml)
     */
    implementation("io.quarkus:quarkus-kubernetes")
    implementation("io.quarkus:quarkus-kubernetes-config")
    /**
     * Reactive (async)
     */
    implementation("io.quarkus:quarkus-mutiny")
    implementation("io.quarkus:quarkus-reactive-routes")
    /**
     * RESTEasy Reactive (expose API)
     */
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    /**
     * REST Client Reactive (connect external APIs)
     */
    implementation("io.quarkus:quarkus-rest-client-reactive")
    implementation("io.quarkus:quarkus-rest-client-reactive-jackson")
    /**
     * Fault Tolerance (retry/timeout)
     */
    implementation("io.quarkus:quarkus-smallrye-fault-tolerance")
    /**
     * Health Check (required Kubernetes)
     */
    implementation("io.quarkus:quarkus-smallrye-health")
    /**
     * Logging (opentracing - gen unique id for logging transacts - correlates logs)
     */
    implementation("io.quarkus:quarkus-logging-gelf")
    implementation("io.quarkus:quarkus-smallrye-opentracing")
    /**
     * Security (encrypt/decrypt; oidc - authentication (checks role with access token))
     */
    implementation("org.bouncycastle:bcprov-jdk15on:1.70")
    implementation("org.bouncycastle:bcpkix-jdk15on:1.70")
    implementation("io.quarkus:quarkus-oidc")
    /**
     * Others (adtl lib - data mapping; jackson-module-kotlin - java to kotlin; jackson-dataformat-xml/jsr310:2.13.1 - parse to xml/json; jackson-databind:2.13.1 -
     * binding data)
     */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
    /**
     * Test (for unit testing)
     */
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

group = "ph.test"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    kotlinOptions.javaParameters = true
}
