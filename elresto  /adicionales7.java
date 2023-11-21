package chiramberro2;
import java.util.Scanner;
public class adicionales7 {

	    public static void main(String[] args) {
	        
	    	 Scanner sc=new Scanner(System.in);
	    	  
	    	  int n;
	    	  
	    	  System.out.println("ingrese un numero ");
	    	  n=sc.nextInt();
	    	  
	    	  System.out.println("Primera cifra  "+(n/100));
	    	  System.out.println("Segunda cifra  "+(n/10%10));
	    	  System.out.println("Tercera cifra  "+(n%10));
	    }
	}
	
