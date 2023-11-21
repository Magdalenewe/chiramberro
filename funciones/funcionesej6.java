package chiramberro2;
import java.util.*;
public class funcionesej6 {

		    public static boolean vocal(char caracter) {
		        char min = Character.toLowerCase(caracter);
		        if (min == 'a') {
		            return true;
		        } else if (min == 'e') {
		            return true;
		        } else if (min == 'i') {
		            return true;
		        } else if (min == 'o') {
		            return true;
		        } else if (min == 'u') {
		            return true;
		        } else {
		            return false;
		        }
		    }
		    

		    public static void main(String[] args) {
		    	 Scanner sc = new Scanner(System.in);
		         System.out.print("ingrese un carácter");
		         char caracter = sc.nextLine().charAt(0);
		         
		         boolean vocal = vocal(caracter);
		         System.out.println("¿Es una vocal? " + vocal);
		       }
		   }
	



