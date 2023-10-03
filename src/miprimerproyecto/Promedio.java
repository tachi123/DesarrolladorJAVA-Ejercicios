package miprimerproyecto;

public class Promedio {

	public static void main(String[] args) {
		int numerosNaturales[] = new int[] { 1, 37, 16 };
		System.out.println(promedio(numerosNaturales));
	}
	
	public static int sumatoria(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + i;
		}
		return resultado;		
	}
	
	public static int promedio(int[] numeros) {
		return sumatoria(numeros)/ numeros.length;
	}

}
