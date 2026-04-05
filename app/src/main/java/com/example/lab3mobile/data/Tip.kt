package com.example.lab3mobile.data

import java.io.Serializable

data class Tip(
    val dayNumber: Int,
    val titleResId: Int,
    val shortDescriptionResId: Int,
    val longDescriptionResId: Int,
    val imageResId: Int
) : Serializable