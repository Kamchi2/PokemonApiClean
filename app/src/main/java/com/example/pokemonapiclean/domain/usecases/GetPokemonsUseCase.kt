package com.example.pokemonapiclean.domain.usecases

import com.example.pokemonapiclean.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonsUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    operator fun invoke() = repository.fetchPokemons()
}