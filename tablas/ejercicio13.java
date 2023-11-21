package capitulo5;

public class ejercicio13 {

	public class Primitiva {
	    public static void main(String[] args) {
	        int[] apuesta = {5, 12, 18, 22, 35, 41}; // Números de la apuesta
	        int[] combinacionGanadora = {5, 11, 18, 22, 34, 40}; // Combinación ganadora

	        int aciertos = contarAciertos(apuesta, combinacionGanadora);
	        System.out.println("Número de aciertos: " + aciertos);
	    }

	    public static int contarAciertos(int[] apuesta, int[] combinacionGanadora) {
	        int aciertos = 0;
	        
	        // Verificar cada número de la apuesta contra la combinación ganadora
	        for (int i = 0; i < apuesta.length; i++) {
	            for (int j = 0; j < combinacionGanadora.length; j++) {
	                if (apuesta[i] == combinacionGanadora[j]) {
	                    aciertos++;
	                    break; // Salir del bucle interno si hay un acierto
	                }
	            }
	        }
	        
	        return aciertos;
	    }
	}
}
