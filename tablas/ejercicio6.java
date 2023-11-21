/*
 *  Diseñar una aplicación para gestionar un campeonato de programación, donde se introducen la puntuación (enteros)
 *   obtenidos por 5 programadores, conforme van terminando su prueba. La aplicación debe mostrar las puntuaciones
 *    ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al 
 *    campeonato un máximo de 3 programadores de exhibición, cuyos puntos se incluyen con el resto. La forma de 
 *    especificar que no intervienen más programadores de exhibición es introducir como puntuación un -1(menos 1) La 
 *    aplicación debe mostrar, finalmente, los puntos ordenados de todos los participantes.
 */

package capitulo5;

import java.util.*;
public class ejercicio6 {

	static int[] vector = new int [5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int negativo, suma;
		boolean salir = false;
		
		while(salir == false) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Participante: " + i);
				suma = sc.nextInt();
				vector[i] =+ suma;
			}
			
			System.out.println("Ahora ingresaran los programadores de exibicion ");
			System.out.println("Ingrese algun numero negativo si no hay ningun participante");
			negativo = sc.nextInt();
			
			if (negativo < 0) {
				salir = true;
			}
			else {
				salir = false;
			}
		}
		
		for (int i = 0; i < 4; i++ ) {
			for (int j = 1; j < 4; i++) {
				if (vector[i] < vector[j]) {
					vector[i] = vector[j];
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Participante " + i + ": " + vector[i]);
		}
		
		
		
			
	}

}
