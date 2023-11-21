package capitulo5;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m;
		
		System.out.println("Ingrese un numero");
		n = sc.nextInt();
		
		//Rellenar array
		int[] array = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el numero " + i);
			m = sc.nextInt();
			array[i] = m;
		}
		
		//Econtrar limites
		int par = 0, impar = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		int[] pares = new int [par];
		int[] impares = new int [impar];
		par = 0;
		impar = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				pares[par] = array[i];
				par++;
			}
			else {
				impares[impar] = array[i];
				impar++;
			}
		}
		
		System.out.println("Pares");
		
		for (int i = 0; i < par; i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("Impares");
		
		for (int i = 0; i < impar; i++) {
			System.out.println(impares[i]);
		}
	}

}
