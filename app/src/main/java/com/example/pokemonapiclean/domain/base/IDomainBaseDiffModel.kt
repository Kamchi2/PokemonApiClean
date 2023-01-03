package com.example.pokemonapiclean.domain.base

interface IDomainBaseDiffModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean
}