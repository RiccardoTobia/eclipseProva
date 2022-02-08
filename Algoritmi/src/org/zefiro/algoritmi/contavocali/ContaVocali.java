package org.zefiro.algoritmi.contavocali;


public class ContaVocali {

	public int result;
	
	public char[] listaLettere;
	
	
	
	public int contare(String parola) {
		
		result = 0;
		
		listaLettere = parola.toUpperCase().toCharArray();
		
		for (var i = 0; i < listaLettere.length; i++) {
			
			this.verificaVocali(listaLettere[i]);
			
		}
		
		return result;
	}
	
	public void verificaVocali(char lettera) 
	{
		
		
		switch (lettera) {
		case 'A': {

			result++;
			break;
		}
		case 'E': {
			
			result++;
			break;
		}
		case 'I': {
			
			result++;
			break;
		}
		case 'O': {
			
			result++;
			break;
		}
		case 'U': {
			
			result++;
			break;
		}
		default:
			break;
		}
		
	}
	
}
