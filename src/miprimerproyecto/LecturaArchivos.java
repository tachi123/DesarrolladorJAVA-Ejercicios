package miprimerproyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LecturaArchivos {
	
	public static void main(String[] args) {
		
		String rutaAbsoluta = "F:\\Argentina Programa 4.0\\Desarrollador JAVA - NEORIS\\MiPrimerProyecto\\recursosArchivoTextoEjemplo.txt";
		
		String rutaRelativa = "recursos/ArchivoTextoEjemplo.txt";
		
		Path pathDelArchivo = Paths.get(rutaRelativa);
		
		try {
			
			for(String linea : Files.readAllLines(pathDelArchivo)) {
				System.out.println(linea);
			}
			
			Files.writeString(pathDelArchivo, "hola\n que tal?\n" );
			
		} catch (FileNotFoundException s) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
