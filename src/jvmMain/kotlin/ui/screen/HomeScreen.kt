package ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.composable.MainCard
import ui.composable.SearchBar
import ui.composable.TodayHighlightsCard
import ui.theme.BackgroundColor

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(BackgroundColor)
    ) {
        Column(modifier = Modifier.fillMaxSize().weight(1F).padding(16.dp)) {
            SearchBar(modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            MainCard()
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                repeat(3) {
                    TodayHighlightsCard(modifier = Modifier.weight(1F))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                repeat(3) {
                    TodayHighlightsCard(modifier = Modifier.weight(1F))
                }
            }
        }
    }
}