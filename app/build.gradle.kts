import dependencies.Libraries
import dependencies.Releases

plugins {
    id("com.android.application")
    id("kotlin-android")

    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Releases.compileSdk)

    defaultConfig {
        applicationId = Releases.applicationId

        minSdkVersion(Releases.minSdk)
        targetSdkVersion(Releases.targetSdk)

        versionCode = Releases.versionCode
        versionName = Releases.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    android.buildFeatures.dataBinding = true
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.kotlin)

    implementation(project(":features:home"))
    implementation(project(":features:login"))
    implementation(project(":core"))

    implementation(Libraries.appCompat)

    implementation(Libraries.timber)
    implementation(Libraries.koin)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.material)
}