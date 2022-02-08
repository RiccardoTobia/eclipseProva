package org.zefiro.algoritmi.solidi;

public class Test {

	public static void main(String[] args) {

		Volume v = new Volume();
		
//		Parallelepipedo parallelepipedo = new Parallelepipedo();
//		
//		parallelepipedo.setAltezza(2);
//		parallelepipedo.setBase(parallelepipedo.calcolaBase(1.5));

//		Cilindro c = new Cilindro();
//		c.setAltezza(3.7);
//		c.setBase(c.calcolaBase(4.4));

		Piramide p = new Piramide();
		p.setAltezza(71.2);
		p.setBase(p.calcolaBase(5.9));
		
		v.calcolaVolume(p);
		
	}

}
