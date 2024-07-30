package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val des: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        "Lorem Ipsum is a dummy text",
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
        R.drawable.onboarding1
    ),
    Page(
        "Lorem Ipsum is a dummy text",
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
        R.drawable.onboarding2
    ),
    Page(
        "Lorem Ipsum is a dummy text",
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
        R.drawable.onboarding3
    ),
)
