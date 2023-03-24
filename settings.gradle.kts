pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    maven("https://jitpack.io")
  }
}

rootProject.name = "abacus-plugin-demo"
include("interfaces")
include("abstracts")
include("implementations")
