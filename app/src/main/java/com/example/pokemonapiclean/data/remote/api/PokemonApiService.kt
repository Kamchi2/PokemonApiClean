package com.example.pokemonapiclean.data.remote.api

import com.example.pokemonapiclean.data.remote.dtos.PokemonDto
import com.example.pokemonapiclean.data.remote.dtos.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemons(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0,
    ): PokemonResponse<PokemonDto>
}