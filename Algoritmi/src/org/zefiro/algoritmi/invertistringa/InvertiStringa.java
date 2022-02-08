package org.zefiro.algoritmi.invertistringa;


public class InvertiStringa {
	
	public String result = "";

	
	public String inverti(String parola) {

		char[] listaLettere = new char[parola.length()];
		
		result ="";
		
		listaLettere = parola.toCharArray();

		
		for (var i = listaLettere.length; i > 0 ; i--) {

			result += listaLettere[i-1];
			
		}
		
		return result;
	}
	
	
}
