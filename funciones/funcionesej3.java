package proyectosjava;
import java.util.*;
public class funcionesej3 {

	public static void cilindro(double altura, double radio, int n) {
		if (n == 1) {
			double total= Math.PI*radio*(altura+radio);
			System.out.println("el area es "+ total);
		}
		if (n == 2) {
			double total = Math.PI*radio*radio*altura ;
			System.out.println("el volumen es "+ total);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("altura");
		double altura = sc.nextDouble();
		System.out.println("radio");
		double radio = sc.nextDouble();
		System.out.println("area(1) volumen(2)");
		int n = sc.nextInt();
		cilindro(altura, radio, n);
	}

}
