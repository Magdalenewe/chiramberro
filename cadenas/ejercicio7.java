package capitulo6;
import java.util.*;
public class ejercicio7 {

	 public static void main(String[] args) {
	        // Crear un objeto Scanner para la entrada estándar
	        Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que introduzca una frase
	        System.out.print("Introduce una frase: ");
	        String frase = scanner.nextLine();

	        // Pedir al usuario que introduzca una palabra a buscar en la frase
	        System.out.print("Introduce una palabra a buscar: ");
	        String palabra = scanner.next();

	        // Cerrar el scanner una vez que hayamos terminado de usarlo
	        scanner.close();

	        // Dividir la frase en palabras utilizando espacios como delimitador
	        String[] palabras = frase.split(" ");

	        // Inicializar un contador para contar cuántas veces aparece la palabra
	        int contador = 0;

	        // Recorrer cada palabra en la frase y compararla con la palabra a buscar
	        for (String palabraFrase : palabras) {
	            // Eliminar signos de puntuación y convertir a minúsculas para comparar de manera insensible a mayúsculas
	            palabraFrase = palabraFrase.replaceAll("[.,!?;]", "").toLowerCase();
	            palabra = palabra.toLowerCase();

	            if (palabraFrase.equals(palabra)) {
	                contador++;
	            }
	        }

	        // Mostrar el resultado
	        System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la frase.");
	    }

}
