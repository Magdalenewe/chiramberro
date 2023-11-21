package chiramberro2;
import java.util.Scanner;
public class dos11 {

	    public static void main(String[] args) {
	        
	    	 Scanner sc=new Scanner(System.in);
	    	  
	    	  int n;
	    	  
	    	  System.out.println("ingrese un numero ");
	    	  n=sc.nextInt();
	    	  if (n >= 0 & n<4 ){
	    		  System.out.println("es insuficiente");
	    	  }
	    	  else if (n == 5 ){
	    		  System.out.println("suficiente");
	    	  }
	    	  else if (n == 6 ){
	    		  System.out.println("bien");
	    	  }
	    	  else if (n == 7 & n==8 ){
	    		  System.out.println("notable");
	    	  }
	    	  else if (n == 8 & n==10 ){
	    		  System.out.println("sobresaliente");
	    	  }
	    	  else {
	    		  System.out.println("moron");
	    		  }
	    	 
	    	  
	    }
	}
	