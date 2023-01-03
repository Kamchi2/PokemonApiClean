package com.example.pokemonapiclean.data.repositories

import com.example.pokemonapiclean.common.resource.Resource
import com.example.pokemonapiclean.data.base.BaseRepository
import com.example.pokemonapiclean.data.remote.api.PokemonApiService
import com.example.pokemonapiclean.data.remote.dtos.toDomain
import com.example.pokemonapiclean.domain.models.PokemonModel
import com.example.pokemonapiclean.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val service: PokemonApiService
) : PokemonRepository, BaseRepository() {
    override fun fetchPokemons(): Flow<Resource<List<PokemonModel>>> = doRequest {
        service.fetchPokemons().results.map {
            it.toDomain()
        }
    }
}