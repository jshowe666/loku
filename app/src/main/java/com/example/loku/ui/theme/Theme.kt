package com.example.loku.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = LokuSky,
    onPrimary = Color(0xFF0F172A),
    secondary = LokuRose,
    onSecondary = Color(0xFF0F172A),
    tertiary = LokuBlush,
    onTertiary = Color(0xFF0F172A),
    background = LokuShell,
    onBackground = Color(0xFF111827),
    surface = LokuMint,
    onSurface = Color(0xFF111827)
)

@Composable
fun LokuTheme(content: @Composable () -> Unit) {
    val colorScheme = LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
