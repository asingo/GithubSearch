package com.github.search.data.repository

import com.github.search.data.model.User

object UserDummy {
    val list: ArrayList<User>
        get(){
            val list = arrayListOf<User>()

            list.add(
                User(
                    "asingo",
                    "https://avatars3.githubusercontent.com/u/33475182?v=4",
                    "https://github.com/asingo",
                    "https://api.github.com/users/asingo/followers",
                    10,
                    "https://api.github.com/users/asingo/following{/other_user}",
                    12,
                    "https://api.github.com/users/asingo/repos",
                    3
                )
            )

            list.add(
                User(
                    "asingo2",
                    "https://upload.wikimedia.org/wikipedia/commons/3/36/Indra_deva.jpg",
                    "https://github.com/asingo",
                    "https://api.github.com/users/asingo/followers",
                    10,
                    "https://api.github.com/users/asingo/following{/other_user}",
                    12,
                    "https://api.github.com/users/asingo/repos",
                    3
                )
            )

            list.add(
                User(
                    "asingo3",
                    "https://upload.wikimedia.org/wikipedia/commons/3/36/Indra_deva.jpg",
                    "https://github.com/asingo",
                    "https://api.github.com/users/asingo/followers",
                    10,
                    "https://api.github.com/users/asingo/following{/other_user}",
                    12,
                    "https://api.github.com/users/asingo/repos",
                    3
                )
            )

            list.add(
                User(
                    "asingo4",
                    "https://upload.wikimedia.org/wikipedia/commons/3/36/Indra_deva.jpg",
                    "https://github.com/asingo",
                    "https://api.github.com/users/asingo/followers",
                    10,
                    "https://api.github.com/users/asingo/following{/other_user}",
                    12,
                    "https://api.github.com/users/asingo/repos",
                    3
                )
            )

            list.add(
                User(
                    "asingo5",
                    "https://upload.wikimedia.org/wikipedia/commons/3/36/Indra_deva.jpg",
                    "https://github.com/asingo",
                    "https://api.github.com/users/asingo/followers",
                    10,
                    "https://api.github.com/users/asingo/following{/other_user}",
                    12,
                    "https://api.github.com/users/asingo/repos",
                    3
                )
            )

            return list
        }
}