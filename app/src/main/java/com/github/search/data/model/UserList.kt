package com.github.search.data.model

data class UserList(
    val total_count: Int = 0,
    val incomplete_results: Boolean = true,
    val items: List<User> = arrayListOf()
)