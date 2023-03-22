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
  id("io.github.alecarnevale.abacus") version "1.0.0"
}

abacus {
  val cls = listOf("Continent", "Felidae", "Africa", "Asia", "Europe", "NorthAmerica", "SouthAmerica", "Oceania", "Antarctica", "Pantherinae", "Felinae")
  val exts = listOf("xml")
  val folders = listOf("ancient", "natural", "new")
  supertypes.set(cls)
  fileExtensions.set(exts)
  fileFolders.set(folders)
}