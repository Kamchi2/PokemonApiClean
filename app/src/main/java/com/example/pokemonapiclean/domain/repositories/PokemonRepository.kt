package com.example.pokemonapiclean.domain.repositories

import com.example.pokemonapiclean.common.resource.Resource
import com.example.pokemonapiclean.domain.models.PokemonModel
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun fetchPokemons(): Flow<Resource<List<PokemonModel>>>
}