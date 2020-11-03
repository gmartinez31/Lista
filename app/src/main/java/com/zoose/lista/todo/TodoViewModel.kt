package com.zoose.lista.todo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

public class TodoViewModel(
    val db: TodoDao,
    application: Application) : AndroidViewModel(application) {

    private val _todos = MutableLiveData<List<Todo>>()

    init {
        initializeTodos()
    }

    private fun initializeTodos() {
        viewModelScope.launch {
            _todos.value = getTodosFromDB().value
        }
    }

    private suspend fun getTodosFromDB(): LiveData<List<Todo>> {
        return db.getAllTodos()
    }


    public fun addTodo() {

    }
}