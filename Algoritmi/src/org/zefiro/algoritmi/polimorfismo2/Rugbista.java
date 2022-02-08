package org.zefiro.algoritmi.polimorfismo2;

public class Rugbista extends Giocatore implements SportivoTerra{

	@Override
	public void descriviPalla() {
		System.out.println("La palla è ovale e bordeaux");
	}

	@Override
	public void corre() {
		System.out.println("Corro su un campo da rugby");
	}

	@Override
	public void salta() {
		System.out.println("Salto su un campo da rugby");		
	}

}
