package com.example.lab3mobile.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab3mobile.R
import com.example.lab3mobile.adapter.TipAdapter
import com.example.lab3mobile.util.DataGenerator
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewTips)

        val adapter = TipAdapter(DataGenerator.generate30Tips()) { tip ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("tip_data", tip)
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }
}