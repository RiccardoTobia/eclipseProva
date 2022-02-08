package org.zefiro.algoritmi.polimorfismo2;

public class AtletaTriatlon implements SportivoTerra, SportivoAcqua {

	@Override
	public void nuota() {
		System.out.println("Nuoto durante la gara");	
	}

	@Override
	public void immerge() {
		System.out.println("Vado sott'acqua durante la gara");	
	}

	@Override
	public void corre() {
		System.out.println("Corro durante la gara");	
	}

	@Override
	public void salta() {
		System.out.println("Salto durante la gara");	
	}
	
	public void vadoInBici() {
		System.out.println("Vado in bici durante la gara");
	}

}
