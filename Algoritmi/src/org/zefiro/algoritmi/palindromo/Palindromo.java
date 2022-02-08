package org.zefiro.algoritmi.palindromo;

public class Palindromo {

	public boolean result = false;
	public char[] listaLettere;
	public String parolaInvertita="";
	
	public boolean checkPalindromo(String parola) {
		
		String parolaUp = parola.replaceAll("\\s+", "").toUpperCase().trim();
	
		
		this.inverti(parolaUp);

		if(parolaInvertita.equals(parolaUp)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	
	public void inverti(String parola) {

		parolaInvertita = "";
		
		listaLettere = parola.toCharArray();
		
		for (var i = listaLettere.length; i > 0 ; i--) {
			parolaInvertita += listaLettere[i-1];
		}
		
	}
	
}
