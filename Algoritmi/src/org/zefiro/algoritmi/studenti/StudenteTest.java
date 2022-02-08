package org.zefiro.algoritmi.studenti;

public class StudenteTest {

	public static void main(String[] args) {

		Esame chimica = new Esame("Chimica", "ieri", 27, 12);
		Esame analisi = new Esame("Analisi", "l'altro ieri", 22, 15);
		Esame storiaContemporanea = new Esame("Storia contemporanea", "oggi", 30, 6);
		
		Studente s = new Studente();
		
		s.addEsame(storiaContemporanea);
		s.addEsame(analisi);
		s.addEsame(chimica);
		
		System.out.println(s.getMedia());
		System.out.println(s.getMediaPonderata());
	}

}
