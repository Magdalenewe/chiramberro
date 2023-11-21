package proyectosjava;
import java.util.*;
public class funcionesej4 {
	
	public static int max(int num1, int num2) {
		
		if (num1>num2) {
		return num1;
	}
		else if (num1<num2) {
			return num2;
		}
		else {
			return num1;
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int maximo = max(num1, num2);
		System.out.println("el máximo es "+ maximo);
	}
}
