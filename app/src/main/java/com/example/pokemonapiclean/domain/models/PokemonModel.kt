package com.example.pokemonapiclean.domain.models

import com.example.pokemonapiclean.domain.base.IDomainBaseDiffModel


data class PokemonModel(
    override val id: Int,
    val name: String
) : IDomainBaseDiffModel<Int>