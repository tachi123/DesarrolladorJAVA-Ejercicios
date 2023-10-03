package miprimerproyecto;

import miprimerproyecto.entidades.Persona;
import miprimerproyecto.entidades.Producto;
import miprimerproyecto.entidades.Carrito;

public class TrabajandoConClases {

	public static void main(String[] args) {
		
		//Instanciar una persona
		Persona nahuel = new Persona("Nahuel","Ramirez");
		System.out.println(nahuel.toString());
		
		//Instanciar 3 productos
		//1 producto solo con su nombre
		Producto harina = new Producto("Harina");
		//2 producto con su nombre, descripcion y peso
		Producto roastBeef = new Producto("Roast beef","Carne de ternera",3000.0);
		Producto leche = new Producto("Leche","Producto lacteo ultra pasteurizado",550.0);
		
		//Instaciar un carrito
		Carrito carrito = new Carrito(nahuel,leche,roastBeef,leche);
		
		System.out.println("Costo final del carrito: "+carrito.costoFinal());
		
	}

}
