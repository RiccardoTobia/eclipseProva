package org.zefiro.algoritmi.astrazione;

public class AutobusTest {

	public static void main(String[] args) {
		
		Autobus antonio = new Autobus();
		
		antonio.colore = "Celestino";
		antonio.peso = 1000;
		antonio.isVeloce = false;
		
//		System.out.println(antonio.nRuote);

		System.out.println(antonio);
		antonio.muoversi();

	}

}
