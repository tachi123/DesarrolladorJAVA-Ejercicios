package miprimerproyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cuestionario04 {

	public static void main(String[] args) {
		
		//Primera pregunta del cuestionario
		
		//int cantVeces = contarLetra("carnaval",'a');
		//System.out.println(cantVeces);
		
		//Cuarta pregunta del cuestionario
		
		String archivo = "recursos/ArchivoTextoEjemplo.txt";
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))){
				if(linea.startsWith("*")){
					System.out.println(linea);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static int contarLetra(String unaPalabra, char letra){
		
		//a.La función puede ser utilizada dentro de un main VERDADERA
		//b. Los parámetros unaPalabra y letra pueden tomar cualquier valor dentro de su tipo
		//c.Si unaPalabra es un String vacío “” la función retorna 0.
		
		int cuenta = 0; //Lo inicializa en 0
			for (int i = 0; i< unaPalabra.length(); i++){
				//En el siguiente, validamos que el caracter en el cual nos encontramos, sea igual al caracter de la búsqueda
				if(unaPalabra.charAt(i) == letra){
						cuenta++;
				}
			}
		return cuenta;
		
	}

	
	
}
