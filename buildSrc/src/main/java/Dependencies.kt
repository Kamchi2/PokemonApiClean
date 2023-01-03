object Versions {
    //build.gradle project
    const val application = "7.2.1"
    const val androidLibrary = "7.2.1"
    const val kotlinAndroid = "1.7.10"
    const val hilt = "2.44"
    const val saveArgs = "2.5.3"

    //build.gradle app
    const val core = "1.7.0"
    const val appCombat = "1.5.1"
    const val material = "1.7.0"
    const val constrait = "2.1.4"
    const val navigation = "2.5.3"
    const val retrofit = "2.9.0"
    const val okhttp = "4.10.0"
    const val lifeCycle = "2.5.1"
    const val viewBindingDelegate = "1.5.6"
    const val coil = "2.2.2"
    const val paging = "3.1.1"
}

object Plugins {
    const val application = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val hilt = "com.google.dagger.hilt.android"
    const val saveArgs = "androidx.navigation.safeargs"
    const val kapt = "kotlin-kapt"
}

object Dependencies {
    object Core {
        const val core = "androidx.core:core-ktx:${Versions.core}"
    }

    object UIComponents {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appCombat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constrait}"
    }

    object Navigation {
        const val navFragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
        const val navUi = "androidx.navigation:navigation-ui:${Versions.navigation}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object OkHttp {
        const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object LifeCycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
        const val runTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
    }

    object ViewBinding {
        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${Versions.coil}"
    }

    object Paging {
        const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    }
}