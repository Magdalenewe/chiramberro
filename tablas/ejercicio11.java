package capitulo5;
import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int [4][4];
		int n, anterior = 0;
		boolean magico = false;
		
		Scanner sc = new Scanner(System.in);
		
		//rellenar matriz
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Ingrese un numero");
				n = sc.nextInt();
				matriz[i][j] = n;
			}
		}
		
		if (esMatrizMagica(matriz)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
		
	}
	
	public static boolean esMatrizMagica(int[][] matriz) {
        // Calcula la suma de la primera fila
        int sumaFila = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            sumaFila += matriz[0][j];
        }

        // Comprueba las sumas de las filas
        for (int i = 1; i < matriz.length; i++) {
            int sumaActual = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        // Comprueba las sumas de las columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaActual = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        // Si todas las sumas coinciden, la matriz es mágica
        return true;

	}
}
