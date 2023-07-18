package ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.koin.java.KoinJavaComponent.inject
import ui.composable.BodyContent
import ui.composable.CustomDivider
import ui.composable.SideBar
import ui.theme.BackgroundColor
import ui.viewmodel.WeatherUiState
import ui.viewmodel.WeatherViewModel

@Composable
fun HomeScreen() {
    val weatherViewModel: WeatherViewModel by inject(WeatherViewModel::class.java)
    val state by weatherViewModel.weatherUiState.collectAsState()

    HomeContent(state = state)
}

@Composable
fun HomeContent(
    state: WeatherUiState
) {
    Box(modifier = Modifier.fillMaxSize().background(color = BackgroundColor)) {
        Image(
            painterResource("image/photo_2.jpg"),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().blur(16.dp),
            contentScale = ContentScale.Crop
        )
        Row {
            SideBar()
            CustomDivider()
            BodyContent(state)
        }
    }
}