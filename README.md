![Imagen 1](Imagen%201.png)
![Imagen 2](Imagen%202.png)
🔗https://dcg0.github.io/DC-laboratory/
🔗https://dcg0.github.io/DC-vs-WIZ/
# DC vs WIZKAS

**DC laboratoriy**

## Jugar y descargar

- [Descargar la APK para Android](https://github.com/dcg0/DC-vs-WIZ/releases/latest/download/DC-vs-WIZ.apk)
- [Descargar el juego web](https://github.com/dcg0/DC-vs-WIZ/releases/latest/download/DC-vs-WIZ-web.zip)

## Compilar la APK

La APK es un contenedor Android WebView. El build copia automáticamente el juego de `game/` a los assets Android.

```bash
cd android
./gradlew assembleRelease
```

El resultado se genera en `android/app/build/outputs/apk/release/app-release-unsigned.apk`. Para distribución, firma el APK con una clave Android.
