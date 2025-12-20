# Loku Android App Scaffold

This repository contains a Jetpack Compose–first Android application scaffold designed for a scalable social experience (infinite feed, friends with QR codes, Firebase auth, Google Maps, and PostgreSQL-backed services).

## Project structure

- `app/src/main/java/com/example/loku/` – application code entry point.
  - `core` – app-wide utilities and base classes.
  - `data` – data sources and repositories.
  - `feature/auth`, `feature/feed`, `feature/friends`, `feature/maps` – vertical feature slices.
  - `ui/theme` – Compose theming.
- `app/src/main/res/` – Android resources (themes, icons, strings, backup rules).

## Build and run

1. Ensure you have the Android SDK (API 35) and an emulator set up.
2. From the project root, run:

   ```bash
   ./gradlew :app:assembleDebug
   ```

3. Install the generated APK to an emulator or run directly via Android Studio.

> Note: To keep the repository binary-light, `gradle/wrapper/gradle-wrapper.jar` is ignored. If you prefer to use the wrapper, regenerate it locally with `gradle wrapper --gradle-version 8.7 --distribution-type all` (or use a compatible system Gradle).

The scaffold uses:

- Android Gradle Plugin 8.6.1 with Kotlin 2.0.21
- Jetpack Compose Material 3 with edge-to-edge defaults

## Next steps

- Wire Firebase authentication and Google Maps SDK keys via `local.properties`.
- Add data layer integrations for PostgreSQL-backed APIs.
- Implement feature modules (auth, feed, friends, maps) as separate packages or Gradle modules as the codebase grows.
