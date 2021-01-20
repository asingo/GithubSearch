package com.github.search.data.remote

import com.github.search.data.model.UserList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {
    @GET("users/asingo")
    fun detailUser(): Call<UserList>

    @GET("search/users")
    fun searchUser(@Query("q") query: String): Call<UserList>

    @GET("users/asingo/followers")
    fun showFollowers(): Call<UserList>

    @GET("users/asingo/following")
    fun showFollowing(): Call<UserList>
}