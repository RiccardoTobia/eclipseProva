package org.zefiro.algoritmi.ui;

	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.AbstractListModel;

	public class ZefiroDefaultListModel extends AbstractListModel {

		private List<String> righe; // Al contrario di awt, in swing posso mettere non solo stringhe.
		
		public ZefiroDefaultListModel() {
			righe = new ArrayList<>();
		}
		
		@Override
		public Object getElementAt(int index) {
			// TODO Auto-generated method stub
			return righe.get(index);
		}
		
		@Override
		public int getSize() { // Informa la parte grafica quante righe disegnare. Torna indietro un intero.
			// TODO Auto-generated method stub
			return righe.size();
		}
	 
		
		// Metodo che permette di inserire items in lista.
		public void addRow(String newRow) {
			righe.add(newRow);
			
			// Faccio un push verso il componente grafico.
			fireContentsChanged(this, 0, getSize()-1); // Dice che è cambiata la lista, dal primo (0) all'ultimo elemento(getSize()-1)-

		}
		
		public void clearAll() {
			righe.clear();
			fireContentsChanged(this, 0, getSize()-1);
		}
		
	}


