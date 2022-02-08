package org.zefiro.algoritmi.liste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {

	private Random rnd = new Random();
	private String nome;
	private String immagine;
	private List<Canzone> playlist;

	
	public String addCanzone(Canzone canzone) {
		
		String rs = "";
		
		if(canzone instanceof Canzone) {
			getPlaylist().add(canzone);
			rs=String.format("Titolo: %s, Autore: %s", canzone.getTitolo(), canzone.getAutore());
		} else {
			System.out.println("DEVI AGGIUNGERE UNA CANZONE");
		}
		
		return rs;
	}
	
	public void vediDurata() {
	int durata = 0;
		
		for (Canzone canzone : playlist) {
			durata += canzone.getDurata();
		}
		
		double durataMinuti = durata / 60;
		System.out.println(String.format("La playlist %s dura %s", getNome(), durataMinuti));
	}
	
	public List<Canzone> cercaPerAutore(String autore) {
		
		List<Canzone> list = new ArrayList();
		
		for (Canzone canzone : getPlaylist()) {
			
			if(canzone.getAutore().equalsIgnoreCase(autore)) {
				list.add(canzone);
			}
		}
		
		return list;
	}
	
	public void cercaPerGenere(String genere) {
		
		for (Canzone canzone : playlist) {
			
			if(canzone.getGenere().equalsIgnoreCase(genere)) {
				System.out.println(canzone.toString());
			}
		}
	}
	
	
	public void shuffle() {
		
		for(int i = 0; i < getPlaylist().size(); i++) {
			int numeroRandom = rnd.nextInt(getPlaylist().size());
			System.out.println(getPlaylist().get(numeroRandom));
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public List<Canzone> getPlaylist() {
		if(playlist == null) {
			playlist = new ArrayList<>();
		}
		return playlist;
	}

	public void setPlaylist(List<Canzone> playlist) {
		this.playlist = playlist;
	}

	
}
