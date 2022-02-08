package org.zefiro.algoritmi.fizzbuzz;

public class FizzBuzz {

	private String fizz = "Fizz";
	private String buzz = "Buzz";
	private String both = "FizzBuzz";
	
	public String FizzBuzz(String numero) {
		
		try {
		
			var dividendo = Integer.parseInt(numero);
			 
			var restoTre = dividendo % 3;
			var restoCinque = dividendo % 5;
			
			if(restoTre == 0 && restoCinque == 0) {
				return both;
			}
			
			if(restoTre == 0) {
				
				return fizz;
				
			}
			
			if(restoCinque == 0) {
				
				return buzz;
			}
			
			return numero;
			  
			  
			  
		} catch (Exception e) {
				return "ERRORE";
		}
		
	}
	
	
}
