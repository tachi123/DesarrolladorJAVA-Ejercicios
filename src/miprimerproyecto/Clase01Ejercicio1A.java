package miprimerproyecto;

public class Clase01Ejercicio1A {

	public static void main(String[] args) {
		
		
//		a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//		y “b”. Su código puede arrancar (por ejemplo):
//		int numeroInicio = 5;
//		int numeroFin = 14;
//		Se deberían mostrar los números:
//		5,6,7,8,9,10,11,12,13,14
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.println("Inicia el item A del ejercicio 1");
		
		while(numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++; // numeroInicio = numeroInicio + 1;
		}
				
		System.out.println("Inicia el item B del ejercicio 1");
//		b. A lo anterior, solo muestre los números pares
		numeroInicio = 5;
		while(numeroInicio <= numeroFin) {
			if(numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
//		c. A lo anterior, con una variable extra, elija si se deben mostrar los números
//		pares o impares
		
		System.out.println("Inicia el item C del ejercicio");
		
		numeroInicio = 5;
		boolean esPar = false; //true -> imprime los pares; false imprime los impares
		
		while(numeroInicio <= numeroFin) {
			if(numeroInicio % 2 == 0 && esPar) {
				System.out.println(numeroInicio);
			}
			if(numeroInicio % 2 != 0 && !esPar) {
				System.out.println(numeroInicio);
			}			
			
			numeroInicio++;
		}
		
		System.out.println("Inicia el item C del ejercicio pero esta vez usando switch");
		
		numeroInicio = 5;
		char parOImpar = 'p'; // p es par   .. i es impar
		
		while(numeroInicio <= numeroFin) {
			switch(parOImpar) {
				case 'p':
					if(numeroInicio % 2 == 0) {
						System.out.println(numeroInicio);
					}
					break;
				case 'i':
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
		
//		d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		numeroInicio = 5;
		System.out.println("Inicial el item D del cuestionario");
		for(numeroFin = 14; numeroInicio <= numeroFin; numeroFin--) {
			if(numeroFin % 2 == 0) {
				System.out.println(numeroFin);
			}
		}
		
		
	}
	
	
}
