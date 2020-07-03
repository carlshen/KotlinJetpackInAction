plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(ProjectProperties.compileSdk)

    defaultConfig {
        applicationId = ProjectProperties.applicationId
        minSdkVersion(ProjectProperties.minSdk)
        targetSdkVersion(ProjectProperties.targetSdk)
        versionCode = ProjectProperties.versionCode
        versionName = ProjectProperties.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.appCompat)
    implementation(Libs.constraintlayout)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.testExt)
    androidTestImplementation(Libs.espresso)

    implementation(Libs.volley)
    implementation(Libs.gson)

    implementation(Libs.glide)
    annotationProcessor(Libs.glideCompiler)
}