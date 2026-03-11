package com.example.lab3mobile.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.R

class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageViewTip)
    val textViewDay: TextView = itemView.findViewById(R.id.textViewDay)
    val textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle)
    val textViewShortDesc: TextView = itemView.findViewById(R.id.textViewShortDesc)
}