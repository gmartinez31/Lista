package com.zoose.lista.todo

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zoose.lista.R
import com.zoose.lista.TodoItemViewHolder

class TodoAdapter : RecyclerView.Adapter<TodoItemViewHolder>() {
    var data = listOf<Todo>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TodoItemViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item.description
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.todo_item_view, parent, false) as TextView
        return TodoItemViewHolder(view);
    }
}