package com.example.lab3mobile.util

import com.example.lab3mobile.R
import com.example.lab3mobile.data.Tip

object DataGenerator {

    fun generate30Tips(): List<Tip> {

        val images = listOf(
            R.drawable.optimized_day1, R.drawable.optimized_day2, R.drawable.optimized_day3, R.drawable.optimized_day4, R.drawable.optimized_day5,
            R.drawable.optimized_day6, R.drawable.optimized_day7, R.drawable.optimized_day8, R.drawable.optimized_day9, R.drawable.optimized_day10,
            R.drawable.optimized_day11, R.drawable.optimized_day12, R.drawable.optimized_day13, R.drawable.optimized_day14, R.drawable.optimized_day15,
            R.drawable.optimized_day16, R.drawable.optimized_day17, R.drawable.optimized_day18, R.drawable.optimized_day19, R.drawable.optimized_day20,
            R.drawable.optimized_day21, R.drawable.optimized_day22, R.drawable.optimized_day23, R.drawable.optimized_day24, R.drawable.optimized_day25,
            R.drawable.optimized_day26, R.drawable.optimized_day27, R.drawable.optimized_day28, R.drawable.optimized_day29, R.drawable.optimized_day30
        )

        return (1..30).map { day ->
            Tip(
                day,
                R.string::class.java.getField("day${day}_title").getInt(null),
                R.string::class.java.getField("day${day}_short").getInt(null),
                R.string::class.java.getField("day${day}_long").getInt(null),
                images[day-1]
            )
        }
    }
}