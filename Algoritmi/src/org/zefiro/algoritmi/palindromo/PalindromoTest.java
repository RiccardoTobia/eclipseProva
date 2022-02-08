package org.zefiro.algoritmi.palindromo;

public class PalindromoTest {

	public static void main(String[] args) {

		Palindromo pal = new Palindromo();
		
		System.out.println(String.format("La parola è palindroma: %s", pal.checkPalindromo("i topi non avevano nipoti")));

	}

}
