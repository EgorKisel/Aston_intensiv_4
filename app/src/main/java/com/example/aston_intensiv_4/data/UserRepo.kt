package com.example.aston_intensiv_4.data

class UserRepo {
    fun getUsers() = listOf(
        User(1, "Egor", "Kisel", "89652519673"),
        User(2, "Anton", "Kisel", "89652519674"),
        User(3, "John", "Typitsyn", "89652519675"),
        User(4, "Nikolai", "Kiy", "89652519676"),
    )
}