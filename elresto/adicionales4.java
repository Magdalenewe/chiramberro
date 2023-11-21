package chiramberro2;
import java.util.Scanner;
public class adicionales4 {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        double radio;
	        System.out.print("Introduce el radio de la esfera: ");
	        radio = sc.nextDouble();
	        System.out.println("Volumen de la esfera de radio " + radio + " = " + (4.0/3)* Math.PI * Math.pow(radio, 3));  
	    }
	}
	
	
	

