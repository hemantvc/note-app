package com.hariom.noteapp.api

import com.hariom.noteapp.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("/users/signup")
    suspend fun signup(@Body userResponse: UserResponse) : Response<UserResponse>

    @POST("/users/signin")
    suspend fun signin(@Body userResponse: UserResponse) : Response<UserResponse>

}