package org.zefiro.algoritmi.geometria;

public class Punti {

	public int x;
	public int y;
	
	public Punti(int xInserita, int yInserita) {
		super();
		this.x = xInserita;
		this.y = yInserita;
	}

	@Override
	public boolean equals(Object other) {
		
		
		/*
		 * Controllo che other sia effettivamente un punto.
		 */
		if(other instanceof Punti) {
			
			
			/*
			 * Impongo con un casting il tipo a other comunque.
			 */
			Punti p = (Punti)other;
			
			if(x == p.x && y == p.y) {
				return true;
			} else
				return false;
			
		} else
		   return false;
	}
	
	
	
	
}
