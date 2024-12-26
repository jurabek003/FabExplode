package uz.turgunboyevjurabek.fabexplode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.fabexplode.navigation.MyNavigation
import uz.turgunboyevjurabek.fabexplode.navigation_objects.MainRout

import uz.turgunboyevjurabek.fabexplode.navigation_objects.SecondRout
import uz.turgunboyevjurabek.fabexplode.screens.MainScreen
import uz.turgunboyevjurabek.fabexplode.ui.theme.FabExplodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FabExplodeTheme {
                val navController = rememberNavController()
                MyNavigation(navController = navController)
            }
        }
    }
}
