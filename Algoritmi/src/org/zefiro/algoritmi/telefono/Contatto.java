package org.zefiro.algoritmi.telefono;

public class Contatto {

	private String nome;
	private String cognome;
	private String numero;
	
	
	protected Contatto(String nome, String cognome, String numero) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}
	
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
