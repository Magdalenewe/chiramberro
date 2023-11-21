package chiramberro2;
import java.util.*;
public class funcionesej9 {
	
	public static boolean primo(int num) {
	     
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true;  
    }
	public static void contprimos(int num2) {
		int cont=0;
		for (int i=1; i<=num2;i++) {
			if (num2 % i == 0 && primo(i)) {
				System.out.println(i);
				cont++;
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num2 = sc.nextInt();
		contprimos(num2);
	}
}