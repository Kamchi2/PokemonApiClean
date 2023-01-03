package com.example.pokemonapiclean.presentation.ui.fragments.pokemon

import androidx.lifecycle.ViewModel
import com.example.pokemonapiclean.domain.usecases.GetPokemonsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val getPokemonsUseCase: GetPokemonsUseCase
) : ViewModel() {

    fun getPokemons() = getPokemonsUseCase()
}