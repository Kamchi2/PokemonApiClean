package com.example.pokemonapiclean.presentation.models

import com.example.pokemonapiclean.domain.models.PokemonModel
import com.example.pokemonapiclean.presentation.base.IBaseDiffModel

data class PokemonUI(
    override val id: Int,
    val name: String
) : IBaseDiffModel<Int>

fun PokemonModel.toUI() = PokemonUI(
    id = id,
    name = name
)