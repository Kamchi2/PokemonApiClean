plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)

    // Kapt
    id(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)

    // Navigation Safe args
    id(Plugins.saveArgs)
}

android {
    namespace = Config.namespace
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
    buildFeatures.viewBinding = true
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // AppCompat
    implementation(Dependencies.UIComponents.appcompat)

    // Material
    implementation(Dependencies.UIComponents.material)

    // ConstraintLayout
    implementation(Dependencies.UIComponents.constraintLayout)

    // NavComponent
    implementation(Dependencies.Navigation.navFragment)
    implementation(Dependencies.Navigation.navUi)

    // Hilt
    kapt(Dependencies.Hilt.hiltCompiler)
    implementation(Dependencies.Hilt.hilt)

    // Retrofit
    implementation(Dependencies.Retrofit.retrofit)

    // Gson
    implementation(Dependencies.Retrofit.retrofitGson)

    // OkHttp
    implementation(platform(Dependencies.OkHttp.okHttpBom))
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.okHttpInterceptor)

    // Lifecycle
    implementation(Dependencies.LifeCycle.viewModel)
    implementation(Dependencies.LifeCycle.runTime)
    implementation(Dependencies.LifeCycle.liveData)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBinding.viewBindingDelegate)

    // Coil
    implementation(Dependencies.Coil.coil)

    // Paging
    implementation(Dependencies.Paging.paging)
}