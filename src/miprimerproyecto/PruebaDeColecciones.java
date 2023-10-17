package miprimerproyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PruebaDeColecciones{

	public static void main(String[] args) {
		
		//Colección TIPO ArrayList
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		listaDeNumeros.add(1);		
		listaDeNumeros.add(100);
		listaDeNumeros.add(50);
		listaDeNumeros.add(1);
		
		System.out.println(listaDeNumeros);
		
		System.out.println("Recorro elemento a elemento una lista");
		
		//La lista de números, debo usar la clase Iterator
		Iterator<Integer> listaParaIterar = listaDeNumeros.iterator();
		while(listaParaIterar.hasNext()) { 
			System.out.println(listaParaIterar.next());
		}		
		
		listaDeNumeros.remove(3);
				
		System.out.println(listaDeNumeros);
		
		List<String> listaDePalabras = new ArrayList<String>();
		
		listaDePalabras.add("casa");
		listaDePalabras.add("árbol");
		listaDePalabras.add("calle");
		listaDePalabras.add("casa");
		
		System.out.println(listaDePalabras);
		
		listaDePalabras.remove("casa");
		
		System.out.println(listaDePalabras);
		
		//Colección tipo HashMap
		//Key - Value o Clave - Valor
		//Clave es ÚNICA
		//Valor es indistinto
		
		Map<Integer,String> ejemploASCII = new HashMap<Integer,String>();
		
		ejemploASCII.put(97, "a");
		ejemploASCII.put(98, "b");
		
		System.out.println("Antes de agregar claves duplicadas");
		System.out.println(ejemploASCII);
		
		System.out.println("Despues de agregar claves duplicadas");
		ejemploASCII.put(97,"h");
		System.out.println(ejemploASCII);
		
		System.out.println("Imprimir por clave");
		System.out.println(ejemploASCII.get(98));
		
		//Hashmap donde la clave va a ser un String
		
		Map<String,Integer> edadesPersonas = new HashMap<String, Integer>();
		
		edadesPersonas.put("Juan", 23);
		edadesPersonas.put("Pablo", 23);
		
		System.out.println("La edad de Juan es: "+edadesPersonas.get("Juan"));
		
		
		//Antes de agregar, puedo validar si la Key ya esta en mi HashMap
		if(edadesPersonas.containsKey("Juan")) {
			//No hago nada
		}else {
			edadesPersonas.put("Juan",30);
		}
		
		//Colección tipo HashSet
		Set<String> lenguajes = new HashSet<String>();
		
		lenguajes.add("Java");
		lenguajes.add("Python");
		lenguajes.add("C++");
		
		System.out.println("Antes de agregar valores duplicados");
		System.out.println(lenguajes);
		
		System.out.println("Después de agregar valores duplicados");
		lenguajes.add("Python");
		lenguajes.add("Python");
		lenguajes.add("Python");
		lenguajes.add("Python");
		lenguajes.add("Python");
		lenguajes.add("Python");
		lenguajes.add("Python");
		System.out.println(lenguajes);
	}

}
