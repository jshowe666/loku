package com.example.loku.feature.feed.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable

@Immutable
data class Author(
    val id: String,
    val name: String,
    @DrawableRes val avatarRes: Int
)

@Immutable
data class FeedPost(
    val id: String,
    val title: String,
    val imageUrl: String,
    val author: Author,
    val likes: Int
)
