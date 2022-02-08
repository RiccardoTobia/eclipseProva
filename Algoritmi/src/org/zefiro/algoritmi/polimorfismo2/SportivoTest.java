package org.zefiro.algoritmi.polimorfismo2;

public class SportivoTest {

	public static void main(String[] args) {

		Calciatore peppe = new Calciatore();
		
		// Innanzitutto notiamo subito che peppe ha tutti i metodi della superClasse Giocatore,
		// anche quelli che non implementa dentro di sé.
		peppe.setNome("Peppe");
		peppe.setCognome("Rossi");
		peppe.setSport("Calcio");		
//		peppe.gioca(peppe.getSport());
//		peppe.descriviPalla();
//		peppe.corre();
//		peppe.salta();
		
		Rugbista ambrogio = new Rugbista();
		
		ambrogio.setNome("Ambrogio");
		ambrogio.setCognome("Bianchi");
		ambrogio.setSport("Rugby");
//		ambrogio.gioca();
//		ambrogio.gioca(ambrogio.getSport());
//		ambrogio.descriviPalla();
//		ambrogio.corre();
//		ambrogio.salta();

		
		Pallanuotista fabrizio = new Pallanuotista();
		
		fabrizio.setNome("Fabrizio");
		fabrizio.setCognome("Verdi");
		fabrizio.setSport("Pallanuoto");
//		fabrizio.gioca(fabrizio.getSport());
//		fabrizio.descriviPalla();
//		fabrizio.nuota();
//		fabrizio.immerge();

		AtletaTriatlon filiberto = new AtletaTriatlon();
		
		ScoutGiocatori mino = new ScoutGiocatori();
		
		mino.valutaGiocatore(fabrizio);

		
	}

}
