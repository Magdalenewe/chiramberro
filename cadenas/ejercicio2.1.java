package capitulo6;
import java.util.*;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Versión 1 - Pistas de longitud y extremos");
        System.out.print("Ingresa la contraseña: ");
        String contraseña = scanner.nextLine();
        int longitud = contraseña.length();
        char primerCaracter = contraseña.charAt(0);
        char ultimoCaracter = contraseña.charAt(longitud - 1);

        System.out.println("La contraseña ha sido configurada. ¡Adivina la contraseña!");
        System.out.println("Pistas: La contraseña tiene " + longitud + " caracteres y comienza con '" + primerCaracter + "' y termina con '" + ultimoCaracter + "'.");

        String intento;
        do {
            System.out.print("Introduce una palabra: ");
            intento = scanner.nextLine();

            if (intento.equals(contraseña)) {
                System.out.println("¡Has acertado la contraseña!");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Sigue intentando.");
            }
        } while (true);

        scanner.close();
	}

}
