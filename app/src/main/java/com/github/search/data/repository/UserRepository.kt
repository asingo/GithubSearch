package com.github.search.data.repository

import android.app.Notification
import com.github.search.data.model.ActionState
import com.github.search.data.model.User
import com.github.search.data.remote.RetrofitApi
import com.github.search.data.remote.UserService
import retrofit2.await

class UserRepository {
    private val userService: UserService by lazy { RetrofitApi.userService() }

    suspend fun detailUser(): ActionState<List<User>> {
        return try {
            val list = userService.detailUser().await()
            ActionState(list.items)
        } catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun searchUser(query: String): ActionState<List<User>>{
        return try {
            val list = userService.searchUser(query).await()
            ActionState(list.items)
        } catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun showFollowers(): ActionState<List<User>> {
        return try{
            val list = userService.showFollowers().await()
            ActionState(list.items)
        } catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun showFollowing(): ActionState<List<User>> {
        return try {
            val list = userService.showFollowing().await()
            ActionState(list.items)
        }catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }
}