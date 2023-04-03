package chiramberro2;
import java.util.Scanner;
public class adicionales8 {

	    public static void main(String[] args) {
	        
	    	 Scanner sc = new Scanner(System.in);
	         int N;
	         System.out.print("Introduzca valor de N: ");
	         N = sc.nextInt(); //supondremos que el número introducido tiene 5 cifras                                  
	         System.out.println(N/10000);
	         System.out.println(N/1000);
	         System.out.println(N/100);
	         System.out.println(N/10);
	         System.out.println(N);  
	    }
	}
	
