package capitulo6;
import java.util.*;

public class ejercicio2version2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Versión 2 - Pistas de longitud y orden alfabético");
        System.out.print("Ingresa la contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("La contraseña ha sido configurada. ¡Adivina la contraseña!");
        System.out.println("Pistas: La contraseña tiene " + contraseña.length() + " caracteres y está en orden alfabético.");

        String intento;
        do {
            System.out.print("Introduce una palabra: ");
            intento = scanner.nextLine();

            int comparacion = contraseña.compareTo(intento);

            if (comparacion == 0) {
                System.out.println("¡Has acertado la contraseña!");
                break;
            } else if (comparacion < 0) {
                System.out.println("La contraseña es mayor alfabéticamente. Sigue intentando.");
            } else {
                System.out.println("La contraseña es menor alfabéticamente. Sigue intentando.");
            }
        } while (true);

        scanner.close();
	}

}
