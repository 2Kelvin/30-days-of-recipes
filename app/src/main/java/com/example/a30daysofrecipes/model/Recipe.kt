package com.example.a30daysofrecipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofrecipes.R

data class Recipe(
    @StringRes val day: Int,
    @StringRes val name: Int,
    @DrawableRes val img: Int,
    @StringRes val desc: Int
)


val recipesList = listOf(
    Recipe(
        day = R.string.day_one,
        name = R.string.day_one_recipe,
        img = R.drawable.rcp_10,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_one,
        name = R.string.day_one_recipe,
        img = R.drawable.rcp_7,
        desc = R.string.day_one_desc
    ),
)