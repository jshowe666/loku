package com.example.loku.feature.feed.ui

import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateListOf
import com.example.loku.feature.feed.model.FeedPost

@Stable
class FeedListState(
    seedPosts: List<FeedPost> = samplePosts
) {
    private val _items = mutableStateListOf<FeedPost>()
    private var page = 0

    val items: List<FeedPost> get() = _items

    init {
        append(seedPosts)
    }

    fun loadMore() {
        val nextPage = samplePosts.mapIndexed { index, post ->
            post.copy(id = "${post.id}-p$page-$index")
        }
        append(nextPage)
        page++
    }

    private fun append(newItems: List<FeedPost>) {
        _items.addAll(newItems)
    }
}
