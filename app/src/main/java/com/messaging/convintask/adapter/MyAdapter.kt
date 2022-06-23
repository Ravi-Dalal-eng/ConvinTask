package com.messaging.convintask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.messaging.convintask.databinding.ListItemBinding

class MyAdapter(private val list:List<Int>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = list[position]
        holder.itemBinding.apply {
            textNumber.setText(number.toString())
        }
    }

    override fun getItemCount() = list.size

    class ViewHolder(val itemBinding: ListItemBinding) : RecyclerView.ViewHolder(itemBinding.root)

}