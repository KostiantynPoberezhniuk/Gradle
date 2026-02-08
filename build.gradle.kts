plugins {
    java
    application
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:32.1.2-jre")
    implementation("com.google.code.gson:gson:2.10.1")
}

application {
    mainClass.set("org.example.Main")
}

tasks.register<Jar>("fatJar") {
    archiveBaseName.set("myname")
    archiveVersion.set("")
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(sourceSets.main.get().output)
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}