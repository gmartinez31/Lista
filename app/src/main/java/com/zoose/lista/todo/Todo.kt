package com.zoose.lista.todo

import androidx.ro

data class Todo (
    var id: Long = 0L,
    var complete: Boolean = false,
    var description: String
)