package com.example.lab3mobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.R
import com.example.lab3mobile.data.Tip

class TipAdapter(
    private var tips: List<Tip>,
    private val onItemClick: (Tip) -> Unit
) : RecyclerView.Adapter<TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.textViewDay.text = holder.itemView.context.getString(R.string.day_prefix, tip.dayNumber)
        holder.textViewTitle.setText(tip.titleResId)
        holder.textViewShortDesc.setText(tip.shortDescriptionResId)
        holder.imageView.setImageResource(tip.imageResId)

        holder.itemView.setOnClickListener {
            onItemClick(tip)
        }
    }

    override fun getItemCount(): Int = tips.size
}