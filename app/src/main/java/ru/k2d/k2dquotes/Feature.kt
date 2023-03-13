package ru.k2d.k2dquotes

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes
    val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
