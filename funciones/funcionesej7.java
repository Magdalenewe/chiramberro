package chiramberro2;
import java.util.*;
public class funcionesej7 {

	public static boolean primo(int num) {
     
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true;  
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        boolean primo1 = primo(num);
        System.out.println(num + " ¿es primo?: " + primo1);

    }
}