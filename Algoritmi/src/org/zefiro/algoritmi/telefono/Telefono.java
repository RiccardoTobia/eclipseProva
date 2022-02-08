package org.zefiro.algoritmi.telefono;

import java.util.ArrayList;
import java.util.List;

public class Telefono {
	
	private int credito;
	private List<Contatto> rubrica;

	public Telefono(int credito) {
		this.credito = credito;
	}
	
	public void salvaContatto(Contatto contatto) {
		
		if(contatto != null) {
			getRubrica().add(contatto);
			
			System.out.println(String.format("E' stato aggiunto alla rubrica il contatto %s %s", contatto.getNome(), contatto.getCognome()));
		} else {
			System.out.println("Nessuno contatto è stato salvato");
		}
	}

	public void eliminaContatto(Contatto contatto) {
		
		if(contatto != null) {
			getRubrica().remove(contatto);
			
			System.out.println(String.format("E' stato eliminato dalla rubrica il contatto %s %s", contatto.getNome(), contatto.getCognome()));
		} else {
			System.out.println("Nessuno contatto è stato salvato");
		}
	}
	
	public int ricarica(int soldi) {
		
		int credito = getCredito();

		if(soldi > 0) {			
			credito = credito + soldi;
			setCredito(credito);
		}
		
		return getCredito();
		
	}
	
	public String chiama(String numero) {
		
		if(numero != "") {
			
			int credito = getCredito();
			
			for (Contatto contatto : rubrica) {
				
				if(contatto.getNumero() == numero) {
					
					if(credito >= 2) {
						
						setCredito(credito - 2);
						
						return String.format("Chiamata a %s %s", contatto.getNome(), contatto.getCognome());   
					} else {
						return String.format("Credito non sufficiente: %s", credito);
					}
					
				}
				
			}
			return "Numero non trovato";
		} 
		
		return "Devi inserire un numero";
	}
	
	public void vediRubrica() {
		
		for (Contatto contatto : rubrica) {
			System.out.println(String.format("%s %s, Numero: %s", contatto.getNome(), contatto.getCognome(), contatto.getNumero()));
		}
	}
	
	
	public List<Contatto> getRubrica() {
		if(rubrica == null) {
			rubrica = new ArrayList<>();
		}
		return rubrica;
	}

	public void setRubrica(List<Contatto> rubrica) {
		this.rubrica = rubrica;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	
 
}
