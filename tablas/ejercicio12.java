package capitulo5;

public class ejercicio12 {

	public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;

        // Crear una matriz 5x5
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con la suma de las coordenadas [n, m]
        for (int n = 0; n < filas; n++) {
            for (int m = 0; m < columnas; m++) {
                matriz[n][m] = n + m;
            }
        }

        // Mostrar el contenido de la matriz
        for (int n = 0; n < filas; n++) {
            for (int m = 0; m < columnas; m++) {
                System.out.print(matriz[n][m] + "\t");
            }
            System.out.println(); // Salto de línea para separar filas
        }
    }


}
