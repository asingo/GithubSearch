package com.github.search.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.search.data.model.ActionState
import com.github.search.data.model.User
import com.github.search.data.repository.UserRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repo: UserRepository by lazy { UserRepository() }

    val loading = MutableLiveData(false)
    val actionState = MutableLiveData<ActionState<*>>()

    val detailResp = MutableLiveData<List<User>>()
    val searchResp = MutableLiveData<List<User>>()
    val followingResp = MutableLiveData<List<User>>()
    val followersResp = MutableLiveData<List<User>>()

    val url = MutableLiveData("")
    val query = MutableLiveData("")

    fun detailResp(){
        viewModelScope.launch {
            loading.value = true
            val resp = repo.detailUser()
            actionState.value = resp
            detailResp.value = resp.data
            loading.value = false
        }
    }

    fun searchResp(query: String? = this.query.value){
        query?.let {
            viewModelScope.launch {
                loading.value = true
                val resp = repo.searchUser(it)
                actionState.value = resp
                searchResp.value = resp.data
                loading.value = false
            }
        }
    }

    fun followingResp(){
        viewModelScope.launch {
            loading.value = true
            val resp = repo.showFollowing()
            actionState.value = resp
            followingResp.value = resp.data
            loading.value = false
        }
    }

    fun followersResp(){
        viewModelScope.launch {
            loading.value = true
            val resp = repo.showFollowers()
            actionState.value = resp
            followersResp.value = resp.data
            loading.value = false
        }
    }

}