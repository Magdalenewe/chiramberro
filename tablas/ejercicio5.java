/*Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante 
 * su combinación secreta, que está formado por una combinación de dígitos del uno al
 *  cinco. El jugador especificará cuál es la longitud de la combinación, a mayor
 *   longitud mayor será la dificultad del juego. La aplicación genera, de forma
 *    aleatoria, una combinación secreta que el usuario tendrá que acertar. En cada
 *     intento se muestra como pista, para cada dígito de la combinación introducido 
 *     por el jugador, si es mayor, menor o igual que el correspondiente en la
 *      combinación secreta.
 * 
 */

package capitulo5;

import java.util.*;

public class ejercicio5 {

	static int[] vector = new int [5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cifra, j = 0, cont = 0;
		boolean codigo = false;
		
		for(int i = 0; i < 5; i++) {
			vector[i] = (int) Math.ceil(Math.random() * 6);
		}
		
		System.out.println("Ingrese una cifra para adivinar el codigo");
		cifra = sc.nextInt();
		
		while(codigo == false) {
			
			if(cifra < vector[j]) {
				System.out.println("Un poco mas alto");
				cifra = sc.nextInt();
			}
			else if(cifra > vector[j]) {
				System.out.println("Un poco mas bajo");
				cifra = sc.nextInt();
			}
			else {
				System.out.println("Cifra correcta, pasando a la siguiente");
				cifra = sc.nextInt();
				cont++;
				j++;
			}
			
			if (cont == 5) {
				System.out.println("");
				for (int i = 0; i < 5; i++) {
					
				}
				codigo = true;
			}
			
		}
		
		System.out.println("¡¡¡¡¡¡HAS ENCONTRADO LA CLAVE, FELICIDADES!!!!!");
	}

}
