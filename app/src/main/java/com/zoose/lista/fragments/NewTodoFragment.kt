package com.zoose.lista.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zoose.lista.R

class NewTodoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<>(inflater, R.layout.new_todo_view, container, false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}