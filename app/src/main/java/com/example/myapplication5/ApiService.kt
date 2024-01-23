package com.example.myapplication5

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APiService {
        @GET
     suspend fun getDogsByBreeds(@Url url:String):retrofit2.Response<DogsResponse>
    }
