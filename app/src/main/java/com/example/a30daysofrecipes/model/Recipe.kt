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
        day = R.string.day_2,
        name = R.string.day_2_recipe,
        img = R.drawable.rcp_1,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_3,
        name = R.string.day_3_recipe,
        img = R.drawable.rcp_0,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_4,
        name = R.string.day_4_recipe,
        img = R.drawable.rcp_3,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_5,
        name = R.string.day_5_recipe,
        img = R.drawable.rcp_4,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_6,
        name = R.string.day_6_recipe,
        img = R.drawable.rcp_5,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_7,
        name = R.string.day_7_recipe,
        img = R.drawable.rcp_6,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_8,
        name = R.string.day_8_recipe,
        img = R.drawable.rcp_7,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_8,
        name = R.string.day_8_recipe,
        img = R.drawable.rcp_8,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_9,
        name = R.string.day_9_recipe,
        img = R.drawable.rcp_9,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_10,
        name = R.string.day_10_recipe,
        img = R.drawable.rcp_10,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_11,
        name = R.string.day_11_recipe,
        img = R.drawable.rcp_3,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_12,
        name = R.string.day_12_recipe,
        img = R.drawable.rcp_9,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_13,
        name = R.string.day_13_recipe,
        img = R.drawable.rcp_7,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_14,
        name = R.string.day_14_recipe,
        img = R.drawable.rcp_8,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_15,
        name = R.string.day_15_recipe,
        img = R.drawable.rcp_6,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_16,
        name = R.string.day_16_recipe,
        img = R.drawable.rcp_5,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_17,
        name = R.string.day_17_recipe,
        img = R.drawable.rcp_4,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_18,
        name = R.string.day_18_recipe,
        img = R.drawable.rcp_10,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_19,
        name = R.string.day_19_recipe,
        img = R.drawable.rcp_0,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_20,
        name = R.string.day_20_recipe,
        img = R.drawable.rcp_6,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_21,
        name = R.string.day_21_recipe,
        img = R.drawable.rcp_3,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_22,
        name = R.string.day_22_recipe,
        img = R.drawable.rcp_1,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_23,
        name = R.string.day_23_recipe,
        img = R.drawable.rcp_9,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_24,
        name = R.string.day_24_recipe,
        img = R.drawable.rcp_7,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_25,
        name = R.string.day_25_recipe,
        img = R.drawable.rcp_8,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_26,
        name = R.string.day_26_recipe,
        img = R.drawable.rcp_5,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_27,
        name = R.string.day_27_recipe,
        img = R.drawable.rcp_4,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_28,
        name = R.string.day_28_recipe,
        img = R.drawable.rcp_10,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_29,
        name = R.string.day_29_recipe,
        img = R.drawable.rcp_1,
        desc = R.string.day_one_desc
    ),
    Recipe(
        day = R.string.day_30,
        name = R.string.day_30_recipe,
        img = R.drawable.rcp_6,
        desc = R.string.day_one_desc
    ),
)