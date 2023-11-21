/* Implementar un programa que inicialice una tabla con nuestros números favoritos.
 *  A continuación, pedir al usuario el índice de un elemento que será eliminado de 
 *  la tabla. Continuaremos eliminando elementos hasta que el índice introducido sea 
 *  negativo o hasta que no existan más elementos que borrar. Es imprescindible 
 *  controlar que el índice leído corresponde a un dato válido.
 */

package capitulo5;

import java.util.Scanner;

public class ejercicio4 {

	static int[] vector = new int [6];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int indice = 0, cont = 0;
		boolean blanco = false;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese un numero");
			vector[i] = sc.nextInt();
		}
		
		while (indice <= 6 && blanco == false) {
			System.out.println("Ingrese el indice del numero que quiere borrar");
			indice = sc.nextInt();
			
			vector[indice] = 0;
			
			cont++;
			
			if(cont == 5) {
				blanco = true;
			}
			
		}
		
		System.out.println("NO SE HAN ENCONTRADO ELEMENTOS EN EL VECTOR O HAS INGRESADO UN INDICE NEGATIVO");
	}

}
