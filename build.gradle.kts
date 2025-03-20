plugins {
    id("java-library")
    id("maven-publish")
}

group = "ru.kazantsev.nsd.sdk"
version = "1.0.2"

java {
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/exeki/nsd.sdk.upper_level_classes")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

tasks.javadoc {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("javax.activation:javax.activation-api:1.2.0")
    implementation("org.springframework:spring-web:6.1.5")
    implementation("org.apache.poi:poi-ooxml:5.2.5")
    implementation("org.apache.poi:poi:5.2.5")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.guava:guava:33.1.0-jre")
    implementation("org.gwtproject:gwt-user:2.10.0")
    //Мне говорили что его когда нибудь выпилят из СД
    implementation("org.codehaus.groovy.modules.http-builder:http-builder:0.7.1")
}

