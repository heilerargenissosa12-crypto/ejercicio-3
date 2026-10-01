# Ejercicio 3: Log Levels

- **Concepto:** Strings / Characters (Cadenas de texto en Java)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Analizar logs del sistema que vienen en formato `"[NIVEL]: Mensaje del log"`.

## Tareas a Implementar en `LogLevels.java`:
1. `message(String logLine)`: Devuelve el mensaje sin el nivel ni los espacios en blanco iniciales/finales.
2. `logLevel(String logLine)`: Devuelve el nivel en minúsculas (ej. `"error"`, `"warning"`, `"info"`).
3. `reformat(String logLine)`: Devuelve el mensaje formateado como `"{mensaje} ({nivel})"`.

## Métodos útiles de `java.lang.String`:
- `indexOf(String str)`
- `substring(int beginIndex, int endIndex)`
- `trim()`
- `toLowerCase()`

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
