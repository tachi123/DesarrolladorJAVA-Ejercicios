package miprimerproyecto;

public class Actividad03Desplazamiento {

	public static void main(String[] args) {
		
		String unString = "hola que tal zz";
		
		// ipmb
		
		//Primero pasamos el string a un array de bytes
		byte[] decodedBytes = unString.getBytes();
		
		//validar que puedo hacer reversible el array de bytes a un String
		//System.out.println(new String(decodedBytes));		

		for(int i = 0; i < decodedBytes.length; i++) {
			decodedBytes[i]++;
		}
		
		String otroString = new String(decodedBytes);
		
		System.out.println("Imprimo el String sin desplazamiento: "+unString);
		System.out.println("Imprimo el String con desplazamiento: "+otroString);
		
		String stringOtro = "";
		for(int i = 0; i< unString.length(); i++) {
			stringOtro = stringOtro + new String(unString.codePointAt(i)+1);
		}
		
	}

}
