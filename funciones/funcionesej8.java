package chiramberro2;
import java.util.*;
public class funcionesej8 {
	
	public static boolean primo(int num) {
	     
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true;  
    }
	public static int contprimos(int num2) {
		int cont=0;
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=num2;i++) {
			if (num2 % i == 0 && primo(i)) {
				
				cont++;
			}
			
		}
		return(cont);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num2 = sc.nextInt();
		System.out.println("tiene "+contprimos(num2));
	}
}
