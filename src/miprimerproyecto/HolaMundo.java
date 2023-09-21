package miprimerproyecto;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prueba de instrucciones de asignación:");		
		
		// Instrucciones de asignación y creación de variable
		char unaLetra = 'a';
		boolean unValorBooleano = true;
		int miPrimerContador = 66;
		double unValor = 1.68;
		float otroNum = 2.344f;
		
		System.out.println(unaLetra);
		
		//Instrucción de asignación de variable
		unaLetra = 'b';	
		
		System.out.println(unaLetra);
		
		System.out.println("Prueba de operaciones básicas:");	
		
		//Instrucciones de operaciones básicas
		int suma	= 10 + 20;
		int resta	= 15 - 12;
		int mult	= 10 * 3;
		int div		= 8 / 3;
		int modulo	= 8 % 3;
		
		System.out.println("El modulo de 8 % 3 es: "+modulo);
		
		//Instrucciones con precedencia
		int precedencia1 = 3 * 2 + 3;
		System.out.println(precedencia1);
		int precedencia2 = (3 * 2) + 3;
		System.out.println(precedencia2);
		int precedencia3 = 3 + 3 * 2;
		System.out.println(precedencia3);
		
		//Instrucciones con tipo de dato Boolean
		
		boolean booleano = 10 > 20;
		System.out.println(booleano);
		
		booleano = 15 >= 12;
		System.out.println(booleano);
		
		//Ejemplo de monotributo
		int ingresoDelDocente = 500000;
		int superficieDelDocente = 30;
		
		boolean superaIngresoCatA = ingresoDelDocente < 750000 && superficieDelDocente < 300;
		
		boolean booleanvariableQueAlmacenaUnBooleano = true;
		System.out.println("NOT: "+!booleanvariableQueAlmacenaUnBooleano); //false
		System.out.println("AND: "+(booleanvariableQueAlmacenaUnBooleano && true)); //true
		System.out.println("OR: "+ (booleanvariableQueAlmacenaUnBooleano || true)); //true
		System.out.println("Múltiple: "+ (ingresoDelDocente < 750000 && superficieDelDocente < 300)); //false
		
		
		int unNumero = 30;
		int otroNumero = 20;
		
		if(unNumero < otroNumero) {
			
			 System.out.println("Si es verdad");
			 
		} else {
			
			 unNumero = 20;
			 System.out.println("Es falso, entonces al número mas grande le sume 20");
		}

		//Ejemplo para iniciar con el programa de asignación de categoría de Monotributo
		
		double ingresosCatA = 748382.07;
		int superficieCatA = 30;
		int energiaCatA = 3330;
		
		double ingresosDeLaPersona = 5000000;
		int superficieDeLaPersona = 15;
		int energiaDeLaPersona = 0;
		
		if(ingresosDeLaPersona < ingresosCatA 
				&& superficieDeLaPersona < superficieCatA
				&& energiaDeLaPersona < energiaCatA) {
			System.out.println("SI, es de la categoría A");
		}else {
			System.out.println("No, no es de la categoría A");
		}
			 
		
		
	}

}
