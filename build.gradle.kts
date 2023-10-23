plugins {
    id("java-library")
    id("maven-publish")
}

group = "ru.ekazantsev"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                groupId = project.group.toString()
                artifactId = project.name
                version = project.version.toString()
            }
        }
    }
    repositories {
        mavenLocal()
        mavenLocal()
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation ("com.google.code.findbugs:jsr305:3.0.2")
    implementation ("javax.activation:javax.activation-api:1.2.0")
}

