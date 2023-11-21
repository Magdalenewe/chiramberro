package capitulo6;
import java.util.*;
import java.text.*;
public class ejercicio8 {

	public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase sin tildes
        System.out.print("Introduce una frase sin tildes: ");
        String frase = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Eliminar tildes y espacios de la frase
        String fraseNormalizada = normalizarFrase(frase);

        // Verificar si la frase normalizada es un palíndromo
        if (esPalindromo(fraseNormalizada)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static String normalizarFrase(String frase) {
        // Eliminar tildes y convertir a minúsculas
        String fraseSinTildes = Normalizer.normalize(frase, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();

        // Eliminar espacios
        return fraseSinTildes.replaceAll("\\s", "");
    }

    public static boolean esPalindromo(String frase) {
        String reverso = new StringBuilder(frase).reverse().toString();
        return frase.equals(reverso);
    }
}
