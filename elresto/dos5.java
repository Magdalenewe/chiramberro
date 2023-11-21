package chiramberro2;

import java.util.Scanner;

public class dos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner sc=new Scanner(System.in);
   
   	  System.out.println("ingrese un numero ");
   	  double n1=sc.nextDouble();
   	  
   
   	  
	  if (n1 < 0 & n1>-1 ){
		  System.out.println("es casi cero");
	  }
	  else if (n1 > 0 & n1<1) {
		  System.out.println("es casi cero");
	  }
	  else {
		  System.out.println("moron");
	  }
	}

}
