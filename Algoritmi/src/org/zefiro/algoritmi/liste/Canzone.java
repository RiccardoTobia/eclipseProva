package org.zefiro.algoritmi.liste;

public class Canzone {

	
	private String titolo;
	private String autore;
	private String genere;
	private int durata;
	private boolean hasViual;
	
	
	
	public Canzone(String titolo, String autore, String genere, int durata, boolean hasViual) {
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.durata = durata;
		this.hasViual = hasViual;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public boolean isHasViual() {
		return hasViual;
	}
	public void setHasViual(boolean hasViual) {
		this.hasViual = hasViual;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Now playing: " );
		sb.append(this.getTitolo());
		sb.append(" by ");
		sb.append(this.getAutore());
		
		return sb.toString();
	}
	
	
}
