package miprimerproyecto;

import java.util.Scanner;

public class ContabilidadHerramientas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean terminoElPrograma = false;
		
		String accion = "NO";
		
		while(!terminoElPrograma) {
			
			//CONJUNTO DE INSTRUCCIONES
			System.out.println("Inicia el ciclo while, se ejecutan algunas cosas");
			
			System.out.println("¿Querés termina el programa? SI o NO");
			
			accion = scanner.nextLine();
			
			if(accion.equals("SI")) {
				terminoElPrograma = true;
			}
		}

	}

}
