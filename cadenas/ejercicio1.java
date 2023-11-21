package capitulo6;
import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.next();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.next();

        int longitudPalabra1 = palabra1.length();
        int longitudPalabra2 = palabra2.length();

        if (longitudPalabra1 < longitudPalabra2) {
            System.out.println("La palabra más corta es: " + palabra1);
        } else if (longitudPalabra1 > longitudPalabra2) {
            System.out.println("La palabra más corta es: " + palabra2);
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }
	}

}
