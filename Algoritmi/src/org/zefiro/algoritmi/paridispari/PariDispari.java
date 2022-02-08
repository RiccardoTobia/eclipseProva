package org.zefiro.algoritmi.paridispari;

public class PariDispari {

	
	public boolean result;
	
	public boolean isPari(int numero) {
		
		int resto = numero % 2;
		
		if(resto == 0) {
			return result = true;
		}
		else
		{
			return result = false;
		}
		
	}
	
	public int tryParse(String input, int defaultNumber) {
		
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			return defaultNumber;
		}
	}
}
