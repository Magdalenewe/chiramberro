/*Escribir una aplicación que solicite al usuario cuántos números desea introducir.
 *  A continuación, se introducirá por teclado esa cantidad de números enteros,
 *  y por último, los mostrará en el orden inverso al introducido.
 */

package capitulo5;

import java.util.*;

public class ejercicio2 {

	static int[] vector = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 4;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese un numero");
			vector[i] = sc.nextInt();
		}
		
		System.out.println("Este es el orden inverso de los numeros que puso");
		
		while (j >= 0) {
			System.out.print(vector[j] + " ");
			j--;
		}
	}

}
