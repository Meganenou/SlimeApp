package com.example.slimeapp.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.slimeapp.domain.entities.User
import com.example.slimeapp.domain.usecase.CreateUserUseCase
import com.example.slimeapp.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
) : ViewModel(){

    val text: MutableLiveData<String> = MutableLiveData()

    init {
        text.value = "Salut"
    }

    fun onClickedUser(emailUser : String){
        viewModelScope.launch {Dispatchers.IO
            createUserUseCase.invoke(User("oui"))
            val user = getUserUseCase.invoke("oui")
            val debug = "debug"
        }
    }
}