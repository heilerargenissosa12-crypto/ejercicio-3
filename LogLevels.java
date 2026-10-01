package loglevels;

/**
 * Ejercicio 3: Log Levels
 * Concepto: Strings / Characters (Manipulación de cadenas de texto)
 *
 * En este ejercicio procesamos líneas de registro (logs) que tienen
 * el formato: "[NIVEL]: Mensaje del log"
 */
public class LogLevels {

    /**
     * Extrae el mensaje del log, eliminando espacios en blanco innecesarios al inicio y final.
     * Ejemplo: "[ERROR]: Invalid operation" -> "Invalid operation"
     */
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        return logLine.substring(colonIndex + 1).trim();
    }

    /**
     * Extrae el nivel del log en minúsculas.
     * Ejemplo: "[ERROR]: Invalid operation" -> "error"
     */
    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf("[") + 1;
        int endIndex = logLine.indexOf("]");
        return logLine.substring(startIndex, endIndex).toLowerCase();
    }

    /**
     * Reformatea la línea de registro al formato: "mensaje (nivel)"
     * Ejemplo: "[INFO]: Operation completed" -> "Operation completed (info)"
     */
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
