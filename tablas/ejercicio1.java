/*Diseñar un programa que solicite al usuario que introduzca por teclado 5 números 
 * decimales a continuación, debe mostrar los números en el mismo orden que se han
 *  introducido.*/
package capitulo5;
import java.util.*;

public class ejercicio1 {
	
	static int[] vector = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese un numero ");
			vector[i] = sc.nextInt();
		}
		
		System.out.println("Este es el orden de los numeros que puso");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(vector[i] + " ");		
		}
	}

}
