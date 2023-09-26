package miprimerproyecto;

public class ClaseConArrays {

	public static void main(String[] args) {
		
		//Lado izquierdo: declaramos el array
		//Lado derecho: se crea el array o asignamos valores
		int numeros[] = new int[3];
		
		//numeros[POSICION EN EL ARRAY ]
		
		numeros[0] = 1;
		numeros[1] = 10;
		numeros[2] = 32;
		
		//Prueba del valor almacenado
		//System.out.println(numeros[2]);
		
		//Otra forma de asignar valors a un array
		int numeros2[] = {1, 23, 32, 40};
		
		//Otra forma de asignar y crear valores a un array
		int numeros3[] = new int[] {1,23,32,40};
		
		//System.out.println("Cantidad de elementos que tiene el array: "+numeros2.length);
		
		System.out.println("Imprimo la dirección en memoria:"+ numeros2);
		System.out.println("Los valores del array son:" + numeros2[0] + numeros[1] + numeros[2]);
		
		//Lo que sucede en el FOR es lo siguiente:
		//System.out.println("El elemento en la posición (0+1) es:" numeros[0]);
		//System.out.println("El elemento en la posición (1+1) es:" numeros[1]);
		//System.out.println("El elemento en la posición (2+1) es:" numeros[2]);
		for(int i = 0;i < numeros.length; i++) {
			numeros[i] = numeros[i]*2;
			System.out.println("El elemento en la posición "+(i+1)+" es: "+numeros[i]);
		}
		
		for(int num : numeros2) {
			num = num * 2;
			System.out.println(num);
		}
		
		//Array de letras
		
		char letras[] = {'a','e','i','o','u'};
		
		for(char letra : letras) {
			System.out.println(letra);
		}
		
	}
	
}
