package capitulo5;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio7 {

    public static void main(String[] args) {
	        int[] array1 = new int[6];
	        int[] array2 = new int[6];
	        int n;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        // Leer la primera serie de 6 enteros y almacenarla en array1
	        System.out.println("Ingrese la primera serie de 6 enteros:");
	        for (int i = 0; i < 6; i++) {
	            array1[i] = sc.nextInt();
	        }
	        
	        // Leer la segunda serie de 6 enteros y almacenarla en array2
	        System.out.println("Ingrese la segunda serie de 6 enteros:");
	        for (int i = 0; i < 6; i++) {
	            array2[i] = sc.nextInt();
	        }
	        
	        // Ordenar ambos arreglos
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        
	        // Fusionar los dos arreglos en uno nuevo
	        int[] mergedArray = new int[12];
	        int i = 0, j = 0, k = 0;
	        
	        while (i < 6 && j < 6) {
	            if (array1[i] < array2[j]) {
	                mergedArray[k++] = array1[i++];
	            } else {
	                mergedArray[k++] = array2[j++];
	            }
	        }
	        
	        while (i < 6) {
	            mergedArray[k++] = array1[i++];
	        }
	        
	        while (j < 6) {
	            mergedArray[k++] = array2[j++];
	        }
	        
	        // Mostrar el arreglo fusionado
	        System.out.println("Arreglo fusionado ordenado:");
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}
