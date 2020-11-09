package com.zoose.lista.NewTodo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zoose.lista.R
import com.zoose.lista.databinding.ActivityMainBinding

class NewTodoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: ActivityMainBinding = DataBindingUtil.inflate(inflater, R.layout.new_todo_view, container, false)

        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}