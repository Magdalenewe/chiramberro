package proyectosjava;

import java.util.*;

public class funcionesej5 {

		public static int max(int num1, int num2, int num3) {
		
			int maximo = num1;
	        
	        if (num2 > maximo) {
	            maximo = num2;
	        }
	        
	        if (num3 > maximo) {
	            maximo = num3;
	        }
	        
	        return maximo;
	    }
		
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner (System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int maximo = max(num1, num2, num3);
			System.out.println("el máximo es "+ maximo);
		}
	}


