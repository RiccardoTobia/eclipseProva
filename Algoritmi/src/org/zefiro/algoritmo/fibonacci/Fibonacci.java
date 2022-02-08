package org.zefiro.algoritmo.fibonacci;

public class Fibonacci {
	
	public String findFibo(int number) {

		int[] serie = new int[number];
		
		serie[0] = 1;
		serie[1] = 1;
		
		for(int i = 2; i <= number-1; i++) {
			
			serie[i] = serie[i-1] + serie[i-2];
			
		}
		
		return Integer.toString(serie[number-1]);
		
	}
	
}
