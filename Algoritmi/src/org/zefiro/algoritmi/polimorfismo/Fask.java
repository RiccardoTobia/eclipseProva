package org.zefiro.algoritmi.polimorfismo;

public class Fask implements GruppoMusicale {

	@Override
	public void suona() {
		System.out.println("Il mare davanti");
		
	}

	@Override
	public void calcolaDischi(int nDischi) {
		int dischiVenduti = nDischi * 50000;
		
		System.out.println(dischiVenduti);
	}
	
	

}
