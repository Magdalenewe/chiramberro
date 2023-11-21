/* Introducir por teclado un número n; a continuación solicitar al
 * usuario que teclee n números. Realizar la media de los números 
 * positivos, la media de los negativos y contar el número de ceros introducidos.
 */

package capitulo5;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int limite, n;
		
		System.out.println("Ingrese la cantidad de numeros que quiera ingresar");
		limite = sc.nextInt();
		
		int[] vector = new int [limite];
		
		for (int i = 0; i < limite; i++) {
			System.out.println("Ingrese un numero");
			vector[i] = sc.nextInt();
		}
		
		System.out.print("Orden de los numeros: ");
		
		for(int i = 0; i < limite; i++) {
			System.out.print(vector[i] + " ");
		}
	}

}
