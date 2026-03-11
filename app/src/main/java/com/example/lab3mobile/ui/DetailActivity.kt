package com.example.lab3mobile.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3mobile.R
import com.example.lab3mobile.data.Tip

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView = findViewById<ImageView>(R.id.detailImageView)
        val dayTextView = findViewById<TextView>(R.id.detailDayTextView)
        val titleTextView = findViewById<TextView>(R.id.detailTitleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.detailLongDescriptionTextView)

        val tip: Tip? = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("tip_data", Tip::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra("tip_data") as? Tip
        }

        if (tip != null) {
            imageView.setImageResource(tip.imageResId)
            dayTextView.text = getString(R.string.day_prefix, tip.dayNumber)
            titleTextView.setText(tip.titleResId)
            descriptionTextView.setText(tip.longDescriptionResId)
            supportActionBar?.title = getString(R.string.detail_title_prefix, tip.dayNumber)
        }
    }
}