package com.example.a30daysofrecipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofrecipes.R

data class Recipe(
    val day: Int,
    @StringRes val name: Int,
    @DrawableRes val img: Int,
    @StringRes val desc: Int
)


val recipesList = listOf(
    Recipe(
        day = 1,
        name = R.string.day_one_recipe,
        img = R.drawable.,
        desc = R.string.day_one_desc
    ),
)