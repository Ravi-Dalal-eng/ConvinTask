package com.messaging.convintask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.messaging.convintask.adapter.MyAdapter
import com.messaging.convintask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding : ActivityMainBinding
   private lateinit var list:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list= arrayListOf(0,1,2,3,4,5)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=MyAdapter(list)
        binding.swipeRefreshLayout.setOnRefreshListener {
            list.add(list.size)
            (binding.recyclerView.adapter as MyAdapter).notifyDataSetChanged()
            binding.swipeRefreshLayout.setRefreshing(false)
        }

    }
}