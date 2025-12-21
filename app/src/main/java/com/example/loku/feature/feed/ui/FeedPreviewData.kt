package com.example.loku.feature.feed.ui

import com.example.loku.R
import com.example.loku.feature.feed.model.Author
import com.example.loku.feature.feed.model.FeedPost

private val sampleAuthors = listOf(
    Author(id = "1", name = "Camille Park", avatarRes = R.drawable.ic_placeholder_avatar),
    Author(id = "2", name = "Adrian Shaw", avatarRes = R.drawable.ic_placeholder_avatar),
    Author(id = "3", name = "Mia Chen", avatarRes = R.drawable.ic_placeholder_avatar),
    Author(id = "4", name = "Jonas Patel", avatarRes = R.drawable.ic_placeholder_avatar),
    Author(id = "5", name = "Lena Flores", avatarRes = R.drawable.ic_placeholder_avatar)
)

val samplePosts = listOf(
    FeedPost(
        id = "post-1",
        title = "Sunset over the old bridge",
        imageUrl = "https://images.unsplash.com/photo-1500530855697-b586d89ba3ee",
        author = sampleAuthors[0],
        likes = 248
    ),
    FeedPost(
        id = "post-2",
        title = "Color study in the city",
        imageUrl = "https://images.unsplash.com/photo-1489515217757-5fd1be406fef",
        author = sampleAuthors[1],
        likes = 132
    ),
    FeedPost(
        id = "post-3",
        title = "Morning light, quiet streets",
        imageUrl = "https://images.unsplash.com/photo-1469474968028-56623f02e42e",
        author = sampleAuthors[2],
        likes = 310
    ),
    FeedPost(
        id = "post-4",
        title = "Pastel palette for spring",
        imageUrl = "https://images.unsplash.com/photo-1529101091764-c3526daf38fe",
        author = sampleAuthors[3],
        likes = 184
    ),
    FeedPost(
        id = "post-5",
        title = "Coastal calm at blue hour",
        imageUrl = "https://images.unsplash.com/photo-1470770903676-69b98201ea1c",
        author = sampleAuthors[4],
        likes = 276
    ),
    FeedPost(
        id = "post-6",
        title = "Glass reflections and neon lights",
        imageUrl = "https://images.unsplash.com/photo-1498050108023-c5249f4df085",
        author = sampleAuthors[1],
        likes = 341
    )
)
