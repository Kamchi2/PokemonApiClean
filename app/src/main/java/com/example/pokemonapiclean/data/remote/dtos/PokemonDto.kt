package com.example.pokemonapiclean.data.remote.dtos

import com.example.pokemonapiclean.domain.models.PokemonModel
import com.google.gson.annotations.SerializedName

data class PokemonDto(
    val id: Int,
    @SerializedName("name")
    val name: String
)

fun PokemonDto.toDomain() = PokemonModel(
    id = id,
    name = name
)