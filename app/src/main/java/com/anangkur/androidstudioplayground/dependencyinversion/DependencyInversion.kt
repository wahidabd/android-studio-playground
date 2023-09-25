package com.anangkur.androidstudioplayground.dependencyinversion

open class DependencyInversion {

}

class ChildDependency : DependencyInversion() {
    val isDisabled = true // off
    val isEnabled = false // off

    val isNameNotShowing = true // tidak tampil
    val isNameShowing = false // tidak tampil
}

fun DependencyInversion.orEmpty(): Boolean {
    return false
}