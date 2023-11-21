import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			double n1;
			n1 = sc.nextDouble();
			while (n1 != 0){
			    if (n1%2 ==0){
			        System.out.println("es par");
	}
	            else {
	                System.out.println("no es par");
}
                if (n1 > 0){
                    System.out.println("es positivo");
                }
                else {
                    System.out.println("es negativo");
                }
                
                System.out.println(n1*n1);
                	n1 = sc.nextDouble();
			}
	}
}
                    
