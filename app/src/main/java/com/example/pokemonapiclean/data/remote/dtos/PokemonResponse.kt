package com.example.pokemonapiclean.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class PokemonResponse<T>(
    @SerializedName("next")
    val next: String?,
    @SerializedName("previous")
    val prev: String?,
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<T>
)