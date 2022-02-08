package org.zefiro.algoritmi.liste;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		Playlist p = new Playlist();
		
		p.setNome("LE MIE BAND");
		
		Canzone c1 = new Canzone("La chiave", "Alcaline", "Hard rock", 150, false);
		Canzone c2 = new Canzone("Nuvole", "Last Breathing Youth", "Alternative", 210, true);
		Canzone c3 = new Canzone("Orione", "Alcaline", "Hard rock", 230, true);
		Canzone c4 = new Canzone("La bella la va al fosso", "Aldo Giovanni e Giacomo", "Folk", 150, true);
		
		p.addCanzone(c1);
		p.addCanzone(c2);
		p.addCanzone(c3);
		p.addCanzone(c4);
		
//		for (Canzone song : p.getPlaylist()) {
//			System.out.println(song.toString());
//		}

//		p.vediDurata();

//		p.cercaPerGenere("Alternative");
		
//		p.shuffle();
		
		List<Canzone> list = p.cercaPerAutore("Alcaline");
		
		for(Canzone song : list) {
			System.out.println(song.toString());
		}
		
	}

}
