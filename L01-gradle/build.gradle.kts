import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id ("java")
    id ("com.github.johnrengelman.shadow")
}

dependencies {
    implementation ("com.google.guava:guava")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("HelloOtus")
        archiveVersion.set("0.5")
        archiveClassifier.set("")
        manifest {
            attributes(mapOf("Main-Class" to "ru.hw01_gradle.HelloOtus"))
        }
    }

    build {
        dependsOn(shadowJar)
    }
}
