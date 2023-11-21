package capitulo6;
import java.util.*;
public class ejercicio10 {

	public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la primera palabra
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();

        // Pedir al usuario que introduzca la segunda palabra
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Verificar si las palabras son anagramas
        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("¡Son anagramas!");
        } else {
            System.out.println("No son anagramas.");
        }
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Eliminar espacios y convertir las palabras a minúsculas
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // Verificar si las palabras tienen la misma longitud
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir las palabras en arreglos de caracteres y ordenarlos
        char[] arreglo1 = palabra1.toCharArray();
        char[] arreglo2 = palabra2.toCharArray();
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        // Comparar los arreglos para determinar si son iguales
        return Arrays.equals(arreglo1, arreglo2);
    }

}
