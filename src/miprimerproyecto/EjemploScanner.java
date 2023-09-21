package miprimerproyecto;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Ingresa tu ingreso económico mensual");
		String textoCapturado = obj.nextLine();
		System.out.println("El texto leido por consola es: "+textoCapturado);

	}

}
