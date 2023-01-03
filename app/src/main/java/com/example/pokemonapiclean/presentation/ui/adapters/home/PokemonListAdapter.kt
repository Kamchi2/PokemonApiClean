package com.example.pokemonapiclean.presentation.ui.adapters.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapiclean.common.extension.firstUpper
import com.example.pokemonapiclean.databinding.ItemPokemonBinding
import com.example.pokemonapiclean.presentation.base.BaseDiffUtilItemCallback
import com.example.pokemonapiclean.presentation.models.PokemonUI

class PokemonListAdapter :
    ListAdapter<PokemonUI, PokemonListAdapter.PokemonListViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PokemonListViewHolder(
        ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    inner class PokemonListViewHolder(private val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonUI) {
            binding.pokemonTitleTv.text = model.name.firstUpper()
        }
    }
}