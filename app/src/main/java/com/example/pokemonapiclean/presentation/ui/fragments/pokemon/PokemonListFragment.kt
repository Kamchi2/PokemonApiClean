package com.example.pokemonapiclean.presentation.ui.fragments.pokemon

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.pokemonapiclean.R
import com.example.pokemonapiclean.common.resource.Resource
import com.example.pokemonapiclean.databinding.FragmentPokemonListBinding
import com.example.pokemonapiclean.presentation.models.toUI
import com.example.pokemonapiclean.presentation.ui.adapters.home.PokemonListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PokemonListFragment : Fragment(R.layout.fragment_pokemon_list) {

    private val binding by viewBinding(FragmentPokemonListBinding::bind)
    private val viewModel: PokemonListViewModel by viewModels()
    private val pokemonAdapter = PokemonListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupSubscribes()
    }

    private fun setupRecyclerView() {
        binding.pokemonsRv.adapter = pokemonAdapter
    }

    private fun setupSubscribes() {
        subscribeToPokemon()
    }

    private fun subscribeToPokemon() {
        lifecycleScope.launch {
            viewModel.getPokemons().collect {
                when (it) {
                    is Resource.Error -> {
                        Log.e("anime", it.message.toString())
                    }
                    is Resource.Loading -> {}
                    is Resource.Success -> {
                        val data = it.data?.map { model ->
                            model.toUI()
                        }
                        pokemonAdapter.submitList(data)
                    }
                }
            }
        }
    }
}
