package chiramberro2;
import java.util.*;
public class funcionesej10 {
	
	public static boolean amigos(int num1, int num2) {
        int sumadivisores1 = divisores(num1);
        int sumadivisores2 = divisores(num2);
        if (num1==sumadivisores2 && num2==sumadivisores1) {
        return true;
        }
        else {
        	return false;
        }
        }
    
	
	public static int divisores(int num) {
		int cont=0;
		for (int i=1; i < num; i++) {
			if (num % i == 0){
				cont+=i;
			}
	}
		return cont;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean amigos1 = amigos(num1,num2);
        	System.out.println("¿son amigos?: "+amigos1);
        
	}
	
}
	

