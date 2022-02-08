package org.zefiro.algoritmi.polimorfismo2;

public class Pallanuotista extends Giocatore implements SportivoAcqua {

	public void abbigliamento() {
		System.out.println("Porto la calottina");
	}
	
	@Override
	public void nuota() {
		System.out.println("Nuoto in una piscina da 33 m");
	}

	@Override
	public void immerge() {
		System.out.println("Vado sott'acqua in una piscina da 33 m");
	}

	@Override
	public void descriviPalla() {
		System.out.println("La palla è tonda e gialla");
	}

}
