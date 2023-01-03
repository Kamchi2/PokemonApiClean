package com.example.pokemonapiclean.common.extension

fun String.firstUpper() = this.replaceFirstChar { it.uppercaseChar() }