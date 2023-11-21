package capitulo6;
import java.util.*;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca su nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Eliminar las vocales del nombre completo
        String nombreSinVocales = eliminarVocales(nombreCompleto);

        // Mostrar el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }

    public static String eliminarVocales(String input) {
        // Utilizamos una expresión regular para eliminar las vocales
        // (mayúsculas, minúsculas y acentuadas)
        String resultado = input.replaceAll("[aeiouAEIOUÁÉÍÓÚáéíóú]", "");
        return resultado;
    }

}
