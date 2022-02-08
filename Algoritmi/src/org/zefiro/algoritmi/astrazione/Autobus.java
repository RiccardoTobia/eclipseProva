package org.zefiro.algoritmi.astrazione;

public class Autobus extends MezzoDiTerra{

	public Autobus() {
		nRuote = 4;
	}
	
	@Override
	public void muoversi() {
		System.out.println("Io vado a metano");	
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Colore: ");
		sb.append(this.colore);
		sb.append(" Peso: ");
		sb.append(this.peso);
		sb.append(" Veloce: ");
		sb.append(this.isVeloce);
		sb.append(" Numero delle Ruote: ");
		sb.append(this.nRuote);
		
		return sb.toString();
	}
	
	

}
