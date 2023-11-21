package proyectosjava;
import java.util.*;
public class funcionesej2 {
	static void comprendidos (int num1, int num2){
		if (num1<num2){
			for (int i=num1+1; i<num2; i++){
				System.out.println(i);
			}
	}
		else {
			for (int i=num2; i<num1; i++){
				System.out.println(i);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		comprendidos(num1, num2);
		
	}

}
