package org.zefiro.algoritmi.solidi;

public class Cilindro extends Solido {

	@Override
	public double calcolaBase(double lato) {
		
		double area = 2*3.14*lato;
		return area;
	}

}
