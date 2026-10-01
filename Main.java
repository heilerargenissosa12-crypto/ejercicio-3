package loglevels;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 3: Log Levels (Strings / Characters)");
        System.out.println("==================================================");

        String sampleError = "[ERROR]: Invalid operation   \r\n";
        String sampleWarning = "[WARNING]:  Disk space low  ";
        String sampleInfo = "[INFO]: User logged in";

        System.out.println("Línea original: \"" + sampleError.trim() + "\"");

        // 1. Obtener mensaje
        String msg = LogLevels.message(sampleError);
        System.out.println("1. Mensaje limpio: \"" + msg + "\" (Esperado: \"Invalid operation\")");

        // 2. Obtener nivel
        String level = LogLevels.logLevel(sampleError);
        System.out.println("2. Nivel en minusculas: \"" + level + "\" (Esperado: \"error\")");

        // 3. Reformatear
        String reformatted = LogLevels.reformat(sampleInfo);
        System.out.println("3. Reformateado: \"" + reformatted + "\" (Esperado: \"User logged in (info)\")");

        boolean ok = msg.equals("Invalid operation") &&
                     level.equals("error") &&
                     reformatted.equals("User logged in (info)");

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
