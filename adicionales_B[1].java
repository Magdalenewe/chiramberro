import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("inserte velocidad en km");
			double km = sc.nextDouble();
			double  ms = km*1000;
			System.out.println("la conversión a m/s es "+ ms);
	}
}