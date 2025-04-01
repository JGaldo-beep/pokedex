package com.example.pokedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Pokemon (
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int,
)
