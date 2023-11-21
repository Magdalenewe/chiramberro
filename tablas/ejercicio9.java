package capitulo5;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] clase = new float [5];
		int nota, cont = 0, i = 0;
		float promedio;
		
		Scanner sc = new Scanner(System.in);
		
		//Rellenar array con las notas y sacar promedio
		while (i < 5) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingrese la nota " + j + ":");
				nota = sc.nextInt();
				cont += nota;
			}
			promedio = cont / 3;
			clase[i] = promedio;
			i++;
		}
		
		System.out.println("Promedios De La Clase");
		
		//Mostrar array con los promedios
		for (int j = 0; j < 5; j++) {
			System.out.println("Alumno " + j + ":  " + clase [j]);
		}
	}

}
