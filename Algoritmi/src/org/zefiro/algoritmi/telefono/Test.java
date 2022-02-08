package org.zefiro.algoritmi.telefono;

public class Test {

	public static void main(String[] args) {
		
		Telefono t = new Telefono(1);
		
		Contatto c1 = new Contatto("Mario", "Rossi", "12345");
		Contatto c2 = new Contatto("Luigi", "Rossi", "654313");
		
		t.salvaContatto(c1);
		t.salvaContatto(c2);
		
		t.vediRubrica();

		System.out.println(t.ricarica(5));
		
		System.out.println(t.chiama("12345"));

	}

}
