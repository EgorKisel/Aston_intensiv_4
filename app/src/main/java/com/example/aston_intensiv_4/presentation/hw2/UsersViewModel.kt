package com.example.aston_intensiv_4.presentation.hw2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aston_intensiv_4.data.User
import com.example.aston_intensiv_4.data.UserRepo

class UsersViewModel() : ViewModel() {

    private val repo: UserRepo = UserRepo()
    private val _data = MutableLiveData<List<User>>()
    val data: LiveData<List<User>> = _data

    fun getData() {
        _data.value = repo.getUsers()
    }

    fun updateUser(updatedUser: User) {
        val currentUsers = _data.value.orEmpty().toMutableList()
        val index = currentUsers.indexOfFirst { it.id == updatedUser.id }
        if (index != -1) {
            currentUsers[index] = updatedUser
            _data.value = currentUsers
        }
    }
}