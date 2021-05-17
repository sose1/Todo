import dependencies.Libraries

plugins {
    id("common-android-library")
    kotlin("kapt")
    id("kotlin-android")
}

dependencies {
    implementation(project(":core"))
    implementation(project(":commons:base"))
    implementation(project(":commons:ui"))

    implementation(Libraries.appCompat)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.material)
    implementation(Libraries.okHttp)

    implementation(Libraries.liveData)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigation)
    implementation(Libraries.coroutines)
    implementation(Libraries.coroutinesAndroid)
    kapt(Libraries.databinding)
}