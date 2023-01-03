package com.example.pokemonapiclean.data.base

interface IBaseDiffDataModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean
}