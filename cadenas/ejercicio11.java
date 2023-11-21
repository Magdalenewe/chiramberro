package capitulo6;
import java.util.*;
public class ejercicio11 {

	public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Eliminar espacios y convertir la frase a minúsculas
        frase = frase.replaceAll("\\s", "").toLowerCase();

        // Crear un mapa para contar las letras
        Map<Character, Integer> contadorLetras = new HashMap<>();

        // Recorrer la frase y contar las letras
        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                contadorLetras.put(letra, contadorLetras.getOrDefault(letra, 0) + 1);
            }
        }

        // Mostrar el resultado
        for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }
    }
}
