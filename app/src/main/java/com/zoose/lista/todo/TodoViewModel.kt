package com.zoose.lista.todo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

public class TodoViewModel(
    val db: TodoDao,
    application: Application) : AndroidViewModel(application) {

    private val _todo = MutableLiveData<Todo>()
//    public val todo = LiveData<Todo>
//        get() = _todo


    public fun addTodo() {

    }
}