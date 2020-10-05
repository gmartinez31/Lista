package com.zoose.lista

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zoose.lista.Todo.Todo

public class TodoViewModel : ViewModel() {

    private val _todo = MutableLiveData<Todo>()
    public val todo = LiveData<Todo>
        get() = _todo


    public fun addTodo() {

    }
}