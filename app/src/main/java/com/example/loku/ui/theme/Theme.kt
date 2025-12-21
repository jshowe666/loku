package com.example.loku.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = LokuRose,
    onPrimary = LokuInk,
    secondary = LokuBlush,
    onSecondary = LokuInk,
    tertiary = LokuSky,
    onTertiary = LokuInk,
    background = LokuInk,
    surface = LokuInk,
    surfaceVariant = LokuOnLight,
    onBackground = LokuCloud,
    onSurface = LokuCloud,
    onSurfaceVariant = LokuCloud.copy(alpha = 0.8f)
)

private val LightColorScheme = lightColorScheme(
    primary = LokuRose,
    onPrimary = LokuInk,
    secondary = LokuBlush,
    onSecondary = LokuInk,
    tertiary = LokuSky,
    onTertiary = LokuInk,
    background = LokuCloud,
    surface = LokuMint,
    surfaceVariant = LokuCloud,
    onBackground = LokuOnLight,
    onSurface = LokuOnLight,
    onSurfaceVariant = LokuOnLight.copy(alpha = 0.75f)
)

@Composable
fun LokuTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (useDarkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        useDarkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !useDarkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
