package miprimerproyecto.ejemploJerarquiaClases;

import java.util.Scanner;

public class PruebaObras {

	public static void main(String[] args) {
		
		String tituloDelLibro;
		String autorDelLibro;
		int numeroDePaginas;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el titulo del libro");
		tituloDelLibro = teclado.nextLine();
		
		System.out.println("Introduzca el autor del libro");
		autorDelLibro = teclado.nextLine();
		
		System.out.println("Introduzca la cantidad de páginas");
		numeroDePaginas = teclado.nextInt();
		
		Libro libro1 = new Libro(tituloDelLibro, autorDelLibro, numeroDePaginas);
		Cuadro cuadro = new Cuadro("titulo cuadro","autor",12,12);
		
		System.out.println(libro1.getAtributos());
		
		
	}
}
