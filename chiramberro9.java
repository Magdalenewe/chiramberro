package chiramberro2;
import java.util.*;
public class asdf {
	

	 
	    public static void main(String[] args) {
	       
	        Scanner sc= new Scanner(System.in);
	        double contmanzanas = 0;
	        double contperas = 0;
	        double totalperas = 0;
	        double totalmanzanas =0;
	        
	        System.out.println("inserte el precio actual de las peras");
	        double precioperas = sc.nextInt();
	        System.out.println("inserte el precio actual de las manzanas");
	        double preciomanzanas = sc.nextInt();
	        
	        System.out.println("inserte cuántos kg de pera se vendieron el primer trimetre");
	        int peras = sc.nextInt();
	        System.out.println("inserte cuántos kg de manzanas se vendieron el primer trimetre");
	        int manzanas = sc.nextInt();
	        
	        contmanzanas = (contmanzanas + manzanas);
	        contperas = (contperas + peras);

	        System.out.println("inserte cuántos kg de pera se vendieron el segundo trimetre");
	        peras = sc.nextInt();
	        System.out.println("inserte cuántos kg de manzanas se vendieron el segundo trimetre");
	        manzanas = sc.nextInt();
	        
	        contmanzanas = (contmanzanas + manzanas);
	        contperas = (contperas + peras);
	        System.out.println("inserte cuántos kg de pera se vendieron el tercer trimetre");
	        peras = sc.nextInt();
	        System.out.println("inserte cuántos kg de manzanas se vendieron el tercer trimetre");
	        manzanas = sc.nextInt();
	        
	        contmanzanas = (contmanzanas + manzanas);
	        contperas = (contperas + peras);
	        
	        totalperas = (contperas*precioperas);
	        totalmanzanas = (contmanzanas*preciomanzanas);
	        
	        System.out.println("el total es de "+(totalmanzanas+totalperas));
	        
}
}