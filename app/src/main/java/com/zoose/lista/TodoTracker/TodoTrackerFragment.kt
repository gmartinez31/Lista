package com.zoose.lista.TodoTracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zoose.lista.R
import com.zoose.lista.databinding.ActivityMainBinding

class TodoTrackerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: ActivityMainBinding = DataBindingUtil.inflate(inflater, R.layout.activity_main, container, false)

        val todoTrackerViewModel = ViewModelProvider.

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}