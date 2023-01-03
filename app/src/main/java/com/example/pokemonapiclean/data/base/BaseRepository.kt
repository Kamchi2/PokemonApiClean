package com.example.pokemonapiclean.data.base

import com.example.pokemonapiclean.common.resource.Resource
import kotlinx.coroutines.flow.flow
import java.io.IOException


abstract class BaseRepository {

    fun <T> doRequest(result: suspend () -> T) = flow {
        emit(Resource.Loading())

        try {
            emit(Resource.Success(result()))
        } catch (exception: IOException) {
            emit(Resource.Error(exception.message.toString()))
        }
    }
}