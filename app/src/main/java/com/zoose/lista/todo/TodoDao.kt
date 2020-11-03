package com.zoose.lista.todo;

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {

    @Insert
    suspend fun insert(todo: Todo)

    @Update
    suspend fun update(todo: Todo)

    @Delete
    suspend fun delete(todo: Todo)

    @Query("SELECT * FROM todo WHERE id= :key")
    suspend fun get(key: Long): Todo?

    @Query("DELETE FROM todo")
    suspend fun clear()

    @Query("SELECT * FROM todo ORDER BY id DESC")
    fun getAllTodos(): LiveData<List<Todo>>
}
