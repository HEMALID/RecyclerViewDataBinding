package com.example.recyclerviewdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdatabinding.databinding.ListItemBinding

class MyAdapter(private val data: List<DataModel>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel){
            binding.listItem = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemBinding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}