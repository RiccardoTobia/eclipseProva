package org.zefiro.algoritmi.polimorfismo2;

public class Calciatore extends Giocatore implements SportivoTerra{

	
	@Override
	public void descriviPalla() {
		System.out.println("La palla è tonda e bianca e nera");
	}

	@Override
	public void corre() {
		System.out.println("Corro su un campo da calcio");
		
	}

	@Override
	public void salta() {
		System.out.println("Salto su un campo da calcio");
	}
	
}
