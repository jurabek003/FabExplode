@file:OptIn(ExperimentalSharedTransitionApi::class)

package uz.turgunboyevjurabek.fabexplode.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.fabexplode.navigation_objects.MainRout
import uz.turgunboyevjurabek.fabexplode.navigation_objects.SecondRout
import uz.turgunboyevjurabek.fabexplode.screens.MainScreen
import uz.turgunboyevjurabek.fabexplode.screens.SecondScreen
import uz.turgunboyevjurabek.fabexplode.utils.ConstItems.FAB_EXPLODE_BOUNDS_KEY

@Composable
fun MyNavigation(modifier: Modifier = Modifier,navController : NavHostController) {

    val fabColor = Color.Green
    SharedTransitionLayout {
        NavHost(
            navController = navController,
            startDestination = MainRout,
            modifier = Modifier
                .fillMaxSize()
        ) {
            composable<MainRout> {
                MainScreen(
                    fabColor = fabColor,
                    animatedVisibilityScope = this,
                    onFabClick = {
                        navController.navigate(SecondRout)
                    }
                )
            }

            composable<SecondRout> {
                SecondScreen(
                    fabColor = fabColor,
                    animatedVisibilityScope = this
                )
            }
        }

    }
}