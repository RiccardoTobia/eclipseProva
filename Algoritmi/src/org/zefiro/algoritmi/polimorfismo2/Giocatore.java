package org.zefiro.algoritmi.polimorfismo2;

public abstract class Giocatore {

	private String nome;
	private String cognome;
	private String sport;
	
	public void gioca() {
		System.out.println("Sto giocando");
	}
	
	public void gioca(String sport) {
		if(sport != null) {			
			System.out.println(String.format("Io gioco a %s", sport));
		}
	}
	
	
	public abstract void descriviPalla();
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}

}
