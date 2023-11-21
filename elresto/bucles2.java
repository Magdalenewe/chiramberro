import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int cont=0;
			int edad;
			int mayores=0;
			int totaledad=0;
			int promedio;
			edad = sc.nextInt();
			while (edad < 0){
			    cont = cont+1;
			    totaledad=totaledad+edad;
			    if (edad>18){
			        mayores=mayores+1;
	}
	            
	            
	           	edad = sc.nextInt();
			}
			
			System.out.println("total alumnos: "+cont);
	            System.out.println("total de edad: "+totaledad);
	            System.out.println("mayores: "+mayores);
	            promedio=totaledad/cont;
	            System.out.println("promedio: "+promedio);
	}
	}
}
