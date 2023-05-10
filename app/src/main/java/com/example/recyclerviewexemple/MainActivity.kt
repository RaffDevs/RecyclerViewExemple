package com.example.recyclerviewexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexemple.adapter.ItemAdapter
import com.example.recyclerviewexemple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBindig()
        setupRecyclerView()
    }

    private fun setupBindig() {
        recyclerView = binding.recyclerList
    }

    private fun setupRecyclerView() {
        val list = listOf<String>(
            "Banana",
            "Apple",
            "Pineapple",
            "Cherry",
            "Grape",
            "Lemon",
            "Avocado"
        )

        val adapter = ItemAdapter(list)
        recyclerView.adapter = adapter
    }
}

