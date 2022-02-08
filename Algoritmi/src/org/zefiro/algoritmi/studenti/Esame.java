package org.zefiro.algoritmi.studenti;

public class Esame {

	private String titolo;
	private String data;
	private int voto;
	private int crediti;
	
	
	
	
	protected Esame(String titolo, String data, int voto, int crediti) {
		super();
		this.titolo = titolo;
		this.data = data;
		this.voto = voto;
		this.crediti = crediti;
	}
	
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	
}
