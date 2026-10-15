![Imagen 1](https://github.com/user-attachments/assets/XXXXX-XXXXX)
![Imagen 2](https://github.com/user-attachments/assets/YYYYY-YYYYY)

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
