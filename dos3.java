package chiramberro2;

import java.util.Scanner;

public class dos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner sc=new Scanner(System.in);
   
   	  System.out.println("ingrese un numero ");
   	  int n1=sc.nextInt();
   	  System.out.println("ingrese un numero ");
 	  int n2=sc.nextInt();
   	  
   	  
   	  if (n1 == n2 ){
   		  System.out.println("iguales");
   	  }
   	  else if (n1<n2) {
   		  System.out.println(n2);
		  }
   	 else if (n1>n2) {
  		  System.out.println(n1);
		  }
	}

}
