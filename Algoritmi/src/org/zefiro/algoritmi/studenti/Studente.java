package org.zefiro.algoritmi.studenti;

import java.util.ArrayList;
import java.util.List;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	
	private List<Esame> listaEsami;

	
	public void addEsame(Esame esame) {
		
		if(esame instanceof Esame) {
		// Prendo la lista degli esami con getListaEsami() e uso add
		getListaEsami().add(esame);
		} else {
			System.out.println("DEVI INSERIRE UN ESAME");
		}
		
	}
	
	public float getMedia() {
		float media = 0;
		
		for (Esame esame : getListaEsami()) {
			media += esame.getVoto();
			
		}
		
		media /= getListaEsami().size();
		
		return media;
	}
	
	
	public float getMediaPonderata() {
		float media = 0;
		int crediti = 0;
		
		for (Esame esame : getListaEsami()) {
			media += esame.getVoto() * esame.getCrediti();	
			crediti += esame.getCrediti();
		}
		
		media /= crediti;
		
		return media;
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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public List<Esame> getListaEsami() {
		if(listaEsami == null) {
			listaEsami = new ArrayList<>();
		}
		return listaEsami;
	}

	public void setListaEsami(List<Esame> listaEsami) {
		this.listaEsami = listaEsami;
	}
	
	
	
	
}
