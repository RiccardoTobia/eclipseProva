package org.zefiro.algoritmi.geometria;

public class PuntiTest {

	public static void main(String[] args) {
		
		Punti p1 = new Punti(1, 2);
		Punti p2 = new Punti(1, 2);
		
		if(p1.equals(p2)) {
			
			System.out.println("Hurrà");
			
		} else {
			
			System.out.println("Oh no");
		}
		

	}

}
