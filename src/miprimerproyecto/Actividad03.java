package miprimerproyecto;

import java.util.Arrays;
import java.util.Collections;


public class Actividad03 {

	public static void main(String[] args) {
		
		// Actividad 1 - a
		System.out.println("a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en\r\n"
				+ "el String\r\n");
		
		String variableString ="Dado un String y una letra, contar las letras indicadas";
		char unaLetra = 'a';
		int cantVecesDeAparicion = 0;

		for(int i = 0; i < variableString.length();i++) {
			if(variableString.charAt(i) == unaLetra) {
				cantVecesDeAparicion++;
			}
			
		}		
		System.out.println("La cantidad de veces que aparece la letra \""+unaLetra+" \" es: "+cantVecesDeAparicion);
		
		// Actividad 1 b 
		
		System.out.println("b. Dados 3 números y un orden (ascendente o decreciente) que ordene los\r\n"
				+ "mismos y los retorne en un vector de 3");
		
		//Uso Integer para utilizar el metodo sort con reverseOrden
		Integer numeros[] = {-2,23,0,1,2};
		boolean ascendente = false; //false
		
		if(ascendente) {
			//ordene de manera ascendente. De menor a Mayor
			Arrays.sort(numeros);
		}else {
			//ordene de manera descendente. De mayor a menor
			Arrays.sort(numeros, Collections.reverseOrder());
		}
		
		for(int elemento : numeros) {
			System.out.println(elemento);
		}
		

		System.out.println("c. dado un vector de números, y un número X, que sume todos los números > X y\r\n"
				+ "retorne el resultado");
		
		int vectorNumeros[] = {10,20,30,50,-10}; // sumatoria = 100
		int sumatoriaDeNumeros = 0;
		int x = 0; // 100
		
		for(int num : vectorNumeros) {
			if(num >= x) {
				sumatoriaDeNumeros = sumatoriaDeNumeros + num;
			}
		}
		
		System.out.println("La sumatoria de números mayores o iguales de "+x+" es: "+sumatoriaDeNumeros);
		
	}

}
