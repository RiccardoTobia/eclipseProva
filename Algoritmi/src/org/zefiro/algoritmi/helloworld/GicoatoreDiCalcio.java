package org.zefiro.algoritmi.helloworld;

public class GicoatoreDiCalcio extends Sportivo {


	public String nome; 
	public String cognome;
	public boolean vivo;
	public String codiceFiscale;
	
	public GicoatoreDiCalcio() {
 
		vivo = true; 
	}


	public GicoatoreDiCalcio(String parametroNome, 
			       String parametroCognome) {
		      nome = parametroNome;
		      cognome = parametroCognome;
	}
	
	
	public String presentati() { 
		
		return "Ciao!";
	}
	
	@Override
	public String toString() {  
//        return "Nome: " + this.nome + 
//        	   " Cognome: " + this.cognome;
		
//		  return String.format( "Nome: %s Cognome: %s", this.nome, this.cognome); // Modo più svelto per fare quello qui sopra.
		  
// Per costruire stringa posso anche usare un fabbricatore di stringe, cioè un oggetto.
		  StringBuilder sb = new StringBuilder("Nome: ");
		  sb.append(this.nome);
		  sb.append(" Cognome: ");
		  sb.append(this.cognome);
		  return sb.toString();
	
	}

	@Override
	void play() {
		System.out.println("Gioco a calcio");

		
	}
}
