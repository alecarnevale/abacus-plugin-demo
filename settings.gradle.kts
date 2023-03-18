pluginManagement {
  repositories {
    gradlePluginPortal()
    maven(url = "../local-plugin-repository")
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
