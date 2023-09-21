package miprimerproyecto;

import java.util.Scanner;

public class Clase01CEjercicio1AConScanner {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Ingresa un número de inicio");
		int numeroInicio = Integer.parseInt(obj.nextLine());
		System.out.println("Ingresa un número de fin");
		int numeroFin = Integer.parseInt(obj.nextLine());
		System.out.println("Ingresa si queres imprimir los pares (p) o impares (i)");
		String parOImpar = obj.nextLine();
		
		while(numeroInicio <= numeroFin) {
			switch(parOImpar.toUpperCase()) {
				case "P":
					if(numeroInicio % 2 == 0) {
						System.out.println(numeroInicio);
					}
					break;
				case "I":
					if(numeroInicio % 2 != 0) {
						System.out.println(numeroInicio);
					}
					break;
				default:
					System.out.println("Opción ingresada es incorrecta");
					break;
			}
			numeroInicio++;
		}
		
		

	}

}
