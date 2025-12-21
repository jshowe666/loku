package com.example.loku.feature.feed.model

import androidx.compose.ui.graphics.Color

data class Author(
    val id: String,
    val name: String,
    val avatarInitials: String
)

data class Post(
    val id: String,
    val title: String,
    val author: Author,
    val likes: Int,
    val previewColor: Color
)

object PostSamples {
    val posts: List<Post> = listOf(
        Post(
            id = "1",
            title = "Weekend waves at Pacifica",
            author = Author(id = "u1", name = "Avery Park", avatarInitials = "AP"),
            likes = 482,
            previewColor = Color(0xFF7BDFF2)
        ),
        Post(
            id = "2",
            title = "Sunset ride through Mission District",
            author = Author(id = "u2", name = "Jordan Cruz", avatarInitials = "JC"),
            likes = 361,
            previewColor = Color(0xFFB2F7EF)
        ),
        Post(
            id = "3",
            title = "Hidden cafe sketches",
            author = Author(id = "u3", name = "Nova Li", avatarInitials = "NL"),
            likes = 527,
            previewColor = Color(0xFFEFF7F6)
        ),
        Post(
            id = "4",
            title = "Morning run along the Embarcadero",
            author = Author(id = "u4", name = "Kai Thompson", avatarInitials = "KT"),
            likes = 289,
            previewColor = Color(0xFFF7D6E0)
        ),
        Post(
            id = "5",
            title = "Analog photography meetup",
            author = Author(id = "u5", name = "Riley Chen", avatarInitials = "RC"),
            likes = 614,
            previewColor = Color(0xFFF2B5D4)
        )
    )
}
