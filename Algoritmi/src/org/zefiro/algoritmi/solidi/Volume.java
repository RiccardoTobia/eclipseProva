package org.zefiro.algoritmi.solidi;

public class Volume {

	
	public double volume;
	
	public void calcolaVolume(Solido solido) {
		
		if(solido instanceof Piramide) {
			volume = (solido.getBase() * solido.getAltezza()) / 3;
		} else {
			volume = solido.getBase() * solido.getAltezza();		
		}
		
		System.out.println(String.format("il volume del solido è %s", volume));
	}
}
