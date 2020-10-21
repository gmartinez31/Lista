package com.zoose.lista.todo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

public class TodoViewModel : ViewModel() {

    private val _todo = MutableLiveData<Todo>()
//    public val todo = LiveData<Todo>
//        get() = _todo


    public fun addTodo() {

    }
}