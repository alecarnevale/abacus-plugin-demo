buildscript {
  repositories {
    maven("https://jitpack.io")
  }
  dependencies {
    classpath("com.github.kotlinx:ast:0.1.0")
  }
}

plugins {
  id("org.jetbrains.kotlin.jvm") version "1.8.0"
  id("com.alecarnevale.abacus") version "1.0.0"
}
