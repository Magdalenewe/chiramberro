package capitulo6;
import java.util.*;
public class ejercicio9 {

	public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase en el idioma de Javalandia
        System.out.print("Introduce una frase en el idioma de Javalandia: ");
        String frase = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Verificar si la frase está en el idioma de Javalandia
        if (esIdiomaJavalandia(frase)) {
            // Extraer el mensaje sin las muletillas
            String mensaje = obtenerMensajeJavalandia(frase);
            System.out.println("Mensaje en Javalandia: " + mensaje);
        } else {
            System.out.println("La frase no está en el idioma de Javalandia.");
        }
    }

    public static boolean esIdiomaJavalandia(String frase) {
        // Verificar si la frase comienza con "Javalín, javalón" y termina con "javalén, len, len"
        return frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len");
    }

    public static String obtenerMensajeJavalandia(String frase) {
        // Eliminar las muletillas y el silencio al inicio y al final
        int inicioMensaje = "Javalín, javalón".length();
        int finMensaje = frase.length() - "javalén, len, len".length();
        return frase.substring(inicioMensaje, finMensaje).trim();
    }

}
