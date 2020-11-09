package com.zoose.lista.NewTodo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zoose.lista.todo.Todo
import com.zoose.lista.todo.TodoDao
import kotlinx.coroutines.*

class NewTodoViewModel (private val databaseDao: TodoDao) : ViewModel() {

    private val vmJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + vmJob)

    private val _navigateToMainActivity = MutableLiveData<Boolean?>()
    val navigateToMainActivity: LiveData<Boolean?>
        get() = _navigateToMainActivity

    override fun onCleared() {
        super.onCleared()
        vmJob.cancel()
    }

    fun doneNavigating() {
        _navigateToMainActivity.value = null
    }

    fun addNewTodo (todo: Todo) {
        uiScope.launch {
            withContext(Dispatchers.IO) {
                databaseDao.insert(todo)
            }
        }
        _navigateToMainActivity.value = true
    }
}