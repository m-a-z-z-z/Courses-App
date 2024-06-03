package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val integerResourceId: Int,
    @DrawableRes val imageResourceId: Int
)