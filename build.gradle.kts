plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.0").apply(false)
//    id("com.android.library").version("7.4.0").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
    id("com.android.library") version "7.4.0" apply false
//    id("org.jetbrains.kotlin.android") version "1.7.21" apply false
}
repositories {
    google()
    mavenCentral()
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}