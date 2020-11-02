package com.zoose.lista.TodoTracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zoose.lista.R
import com.zoose.lista.todo.TodoAdapter
import com.zoose.lista.databinding.ActivityMainBinding
import com.zoose.lista.todo.TodoDatabase
import com.zoose.lista.todo.TodoViewModel
import com.zoose.lista.todo.TodoViewModelFactory

class TodoTrackerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: ActivityMainBinding = DataBindingUtil.inflate(inflater, R.layout.activity_main, container, false)

        val application = requireNotNull(this.activity).application
        val dataSource = TodoDatabase.getInstance(application).todoDao
        val viewModelFactory = TodoViewModelFactory(dataSource, application)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(TodoViewModel::class.java)
        val adapter = TodoAdapter()

        binding.todoViewModel = viewModel
        binding.todos.adapter = adapter
        binding.lifecycleOwner = this

        return binding.root
    }
}