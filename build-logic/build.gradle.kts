import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.omooooori.kmpmobiletemplate.buildlogic"

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "17"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.bundles.plugins)
    // https://github.com/google/dagger/issues/3068#issuecomment-1470534930
    implementation(libs.javaPoet)
}

gradlePlugin {
    plugins {

    }
}
