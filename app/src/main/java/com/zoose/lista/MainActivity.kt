package com.zoose.lista

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.zoose.lista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.addTodoButton.setOnClickListener { addTodo() }

        // load todos
    }

    private fun addTodo() {
        // probably pop up a modal of sorts
        // include an editText view to add Todo
        // include a save/add button
        // new todo shows up in list
    }
}