package com.example.pokemonapiclean.presentation.base

interface IBaseDiffModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean
}