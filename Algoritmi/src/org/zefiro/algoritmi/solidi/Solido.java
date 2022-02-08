package org.zefiro.algoritmi.solidi;

public abstract class  Solido {
	
	private double base;
	private double altezza;
	
	public abstract double calcolaBase(double lato);

	public double getBase() {
		return base;
	}

	public void setBase(double d) {
		this.base = d;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

}
