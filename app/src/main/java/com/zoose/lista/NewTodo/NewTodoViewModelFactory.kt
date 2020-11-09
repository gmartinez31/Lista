package com.zoose.lista.NewTodo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zoose.lista.todo.TodoDao
import java.lang.IllegalArgumentException

class NewTodoViewModelFactory(private val dataSource: TodoDao) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewTodoViewModel::class.java)) {
            return NewTodoViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel class")
    }
}