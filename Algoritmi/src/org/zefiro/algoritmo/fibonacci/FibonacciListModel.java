package org.zefiro.algoritmo.fibonacci;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

public class FibonacciListModel extends AbstractListModel{

	private List<String> righe;
	
	public FibonacciListModel() {
		
		righe = new ArrayList<>();
		
	}
	
	@Override
	public int getSize() {
		return righe.size();
	}

	@Override
	public String getElementAt(int index) {
		return righe.get(index);
	}

	// Metodo che permette di inserire items in lista.
	public void addRow(String newRow) {
		righe.add(newRow);
		
		// Faccio un push verso il componente grafico.
		fireContentsChanged(this, 0, getSize()-1); // Dice che è cambiata la lista, dal primo (0) all'ultimo elemento(getSize()-1)

	}
	
	public void clearAll() {
		righe.clear();
		fireContentsChanged(this, 0, getSize()-1);
	}
}
