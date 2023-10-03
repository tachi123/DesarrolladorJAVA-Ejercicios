package miprimerproyecto;

public class Cuestionario03 {

	public static void main(String[] args) {
		
		char letras[] = {'a','b','c','d'};

		int numeros[] = new int[]{1,37,16};

		for(int i=0;i<numeros.length;i++){
			if (numeros[i] < 30) {
					System.out.println(letras[i+1]);
			} else {
				System.out.println(numeros[i]);
			}
		}		
		// b 37  d
		
		//    \
		
		System.out.println("\\");
		
		System.out.println("hola que tal?".toUpperCase().replace(
				"hola","chau"));
		
		String[] separado = "3_tristes tigres_del_13".split("_");
		
		//    [  "3" , "tristes tigres" , "del", "13" ]
	}

}
