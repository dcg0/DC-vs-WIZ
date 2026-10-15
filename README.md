# DC vs WIZKAS

**Arcade Tag Fighter · 2 vs 2**

## Jugar y descargar

- [Abrir la página del juego](game/game.html)
- [Descargar la APK para Android](https://github.com/dcg0/DC-vs-WIZ/releases/latest/download/DC-vs-WIZ.apk)
- [Descargar el juego web](https://github.com/dcg0/DC-vs-WIZ/releases/latest/download/DC-vs-WIZ-web.zip)

La página principal del proyecto está en [`index.html`](index.html) y queda lista para GitHub Pages.

## Compilar la APK

La APK es un contenedor Android WebView. El build copia automáticamente el juego de `game/` a los assets Android.

```bash
cd android
./gradlew assembleRelease
```

El resultado se genera en `android/app/build/outputs/apk/release/app-release-unsigned.apk`. Para distribución, firma el APK con una clave Android.
