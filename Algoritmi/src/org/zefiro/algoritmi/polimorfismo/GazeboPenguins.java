package org.zefiro.algoritmi.polimorfismo;

public class GazeboPenguins implements GruppoMusicale {

	@Override
	public void suona() {
		System.out.println("Senza di te");
		
	}

	@Override
	public void calcolaDischi(int nDischi) {
		int dischiVenduti = nDischi * 30000;
		
		System.out.println(dischiVenduti);
	}
	
	

}
