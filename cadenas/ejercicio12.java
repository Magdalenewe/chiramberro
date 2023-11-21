package capitulo6;
import java.util.*;
public class ejercicio12 {

	public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al primer jugador que ingrese una palabra o frase
        System.out.print("Jugador 1, introduce una palabra o frase (no puede estar vacía): ");
        String palabraOriginal = scanner.nextLine();

        // Verificar que la palabra ingresada no esté vacía
        while (palabraOriginal.isEmpty()) {
            System.out.println("La palabra no puede estar vacía. Inténtalo de nuevo.");
            System.out.print("Jugador 1, introduce una palabra o frase: ");
            palabraOriginal = scanner.nextLine();
        }

        // Generar un anagrama aleatorio
        String anagrama = generarAnagrama(palabraOriginal, random);

        // Limpiar la pantalla para ocultar la palabra original
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // Pedir al segundo jugador que adivine el texto original
        System.out.println("Jugador 2, adivina la palabra original a partir del anagrama:");
        System.out.println("Anagrama: " + anagrama);
        System.out.print("Tu respuesta: ");
        String respuesta = scanner.nextLine();

        // Verificar si la respuesta del jugador 2 es correcta
        if (respuesta.equalsIgnoreCase(palabraOriginal)) {
            System.out.println("¡Correcto! Has adivinado la palabra original.");
        } else {
            System.out.println("Lo siento, la respuesta es incorrecta. La palabra original era: " + palabraOriginal);
        }

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();
    }

    public static String generarAnagrama(String palabra, Random random) {
        // Convierte la palabra en un arreglo de caracteres
        char[] caracteres = palabra.toCharArray();

        // Realiza varias transposiciones aleatorias para crear un anagrama
        for (int i = 0; i < caracteres.length; i++) {
            int j = random.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Convierte el arreglo de caracteres en una cadena
        return new String(caracteres);
    }

}
