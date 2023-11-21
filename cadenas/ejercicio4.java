package capitulo6;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Cerrar el scanner una vez que hayamos terminado de usarlo
        scanner.close();

        // Inicializar una variable para contar los espacios en blanco
        int contadorEspacios = 0;

        // Recorrer cada carácter de la frase y contar los espacios en blanco
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }

        // Mostrar el resultado
        System.out.println("La frase contiene " + contadorEspacios + " espacios en blanco.");
	}

}
