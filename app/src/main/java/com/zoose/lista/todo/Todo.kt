package com.zoose.lista.todo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "todo")
data class Todo (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,

    @ColumnInfo(name = "complete")
    var complete: Boolean = false,

    @ColumnInfo(name = "description")
    var description: String
)