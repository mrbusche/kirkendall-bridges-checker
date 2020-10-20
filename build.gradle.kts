plugins {
    id("org.springframework.boot") version "2.4.0-M4"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("java")
    id("groovy")
    id("org.sonarqube") version "3.0"
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
}

group = "com.webpage-checker"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web") {
        exclude("com.fasterxml.jackson.core")
        exclude("com.fasterxml.jackson.datatype")
        exclude("com.fasterxml.jackson.module")
    }
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
    implementation("org.jsoup:jsoup:1.13.1")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    implementation("org.apache.commons:commons-lang3")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.vintage:junit-vintage-engine")
    testImplementation("org.spockframework:spock-core:2.0-M3-groovy-3.0")
    implementation("org.codehaus.groovy:groovy:3.0.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
tasks.withType<Test> {
    useJUnitPlatform()
}
