package miprimerproyecto;

public class ClaseConStrings{
	
	public static void main(String[] args) {
		
		String txt1 = "Hola clase!";
		
		System.out.println(txt1.length());
		
		//Podemos interpretar a la clase String como un array de char, pero no estatico
		char data[] = {'a','b','c'};
		String dataAString = new String(data);
		
		System.out.println(dataAString);
		
		dataAString = "abcdefghijk";
		
		int numero = 2;
		String entradaDelMetodoPrintln = "hola "+"que tal: "+numero;
		
		System.out.println(entradaDelMetodoPrintln);
		
		String txt2 = "Hola";
		String txt3 = "hola";
		
		if(txt2.equals(txt3)) {
			System.out.println("Si es lo mismo");			
		}
		
		System.out.println(txt2.toUpperCase());
		System.out.println(txt2.toLowerCase());
		
		//Funcion split
		
		String apellidoYNombre = "Ramirez, Nahuel,  asdf      ,";
		
		String nombreYApellidoSeparados[] = apellidoYNombre.split(",");
		
		System.out.println(nombreYApellidoSeparados[0]);
		System.out.println(nombreYApellidoSeparados[1]);
		System.out.println(nombreYApellidoSeparados[2]);
		
		String muchasPalabras = "casa arbol mandarina naranja";
		for(String unaPalabra : muchasPalabras.split(" ")) {
			System.out.println(unaPalabra);
		}
		
		String dosLineas = "Las\tcasa.\n   \\ \"Hola.";
		System.out.println(dosLineas);
		
		String txt5 = " holaaa";
		if(txt5.startsWith(" ") && txt5.length()< 20 && txt5.contains("la")) {
			txt5 = txt5.substring(1,txt5.length());
			System.out.println(txt5);
			System.out.println("Si valida la condición");
		}else {
			System.out.println("No valida la condición");
		}
		
		String abecede = "abcdefg";
		
		//Transformar el String al código número de la tabla ASCII
		byte[] decodedBytes = abecede.getBytes();
		
		for(byte letra : decodedBytes) {
			System.out.println(letra);
		}
		
		String frase = new String() ;
		
		
	}
	
	
}