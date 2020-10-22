package com.zoose.lista.todo;

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {

    @Insert
    fun insert(todo: Todo)

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)

    @Query("SELECT * FROM todo WHERE id= :key")
    fun get(key: Long): Todo?

    @Query("DELETE FROM todo")
    fun clear()

    @Query("SELECT * FROM todo ORDER BY id DESC")
    fun getAllTodos(): LiveData<List<Todo>>
}
