package com.example.loku.feature.feed.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.loku.R
import com.example.loku.feature.feed.model.FeedPost
import kotlinx.coroutines.flow.collectLatest

@Composable
fun FeedScreen(
    posts: List<FeedPost> = samplePosts,
    modifier: Modifier = Modifier
) {
    val feedState = remember { FeedListState(posts) }
    val listState = rememberLazyListState()
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val cardHeight = (screenHeight * 0.35f).dp

    LaunchedEffect(listState) {
        snapshotFlow { listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index }
            .collectLatest { index ->
                if (index != null && index >= feedState.items.size - 2) {
                    feedState.loadMore()
                }
            }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 0.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        state = listState
    ) {
        item {
            Text(
                text = stringResource(id = R.string.feed_title),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
            )
        }

        items(feedState.items, key = { it.id }) { post ->
            FeedCard(
                post = post,
                modifier = Modifier.height(cardHeight)
            )
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
