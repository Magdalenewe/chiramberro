package capitulo6;
import java.util.*;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Ejemplo de cómo usar la función invertirCadena
		System.out.print("Ingrese una palabra: ");
        String cadenaOriginal = sc.nextLine();
        String cadenaInvertida = invertirCadena(cadenaOriginal);
        sc.close();
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadena(String cadena) {
        // Crear un objeto StringBuilder para construir la cadena invertida
        StringBuilder cadenaInvertida = new StringBuilder();

        // Recorrer la cadena original desde el final hacia el principio
        for (int i = cadena.length() - 1; i >= 0; i--) {
            // Agregar cada carácter al StringBuilder
            cadenaInvertida.append(cadena.charAt(i));
        }

        // Convertir el StringBuilder a una cadena y devolverla
        return cadenaInvertida.toString();
    }

}
