package com.example.pokemonapiclean.di

import com.example.pokemonapiclean.data.repositories.PokemonRepositoryImpl
import com.example.pokemonapiclean.domain.repositories.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindPokemonRepository(repositoryImpl: PokemonRepositoryImpl): PokemonRepository

}