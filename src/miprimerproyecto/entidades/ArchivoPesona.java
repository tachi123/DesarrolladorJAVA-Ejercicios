package miprimerproyecto.entidades;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArchivoPesona {
	
	private String nombre;
	
	//Crear una función
	//Que a partir del número de una línea
	//Con los datos de esa linea, crear una persona
	public Persona leerRegistro(int posicion) {
		
		String rutaRelativa = "recursos/archivoPersonas.csv";
		
		Path pathDelArchivo = Paths.get(rutaRelativa);
		
		try {
			for(String linea : Files.readAllLines(pathDelArchivo)) {

				if(POSICIÓN QUE QUIERO) {
					Persona persona = new Persona(linea.split(",")[0],linea.split(",")[1]);
				}
				
			}
			Files.writeString(pathDelArchivo, "hola\n que tal?\n" );
			
		} catch (FileNotFoundException s) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
