package org.zefiro.algoritmo.fibonacci;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FibonacciUI extends JFrame {
	
	private JPanel pnlFibo;
	private JLabel lblMessage;
	private JTextField txtNumero;
	private JButton btnFibo;
	private JLabel lblResult;
	private JTextField txtResult;
	private JList<String> previousList;
	private JPanel pnlList;
	
	private FibonacciListModel listModel;
	
	private Fibonacci business;
	
	public FibonacciUI() {
		
		business = new Fibonacci();
		
		pnlFibo = new JPanel(new GridLayout(2,3));
		
		lblMessage = new JLabel("Inserisci quale numero della sequenza vuoi sapere: ");
		txtNumero = new JTextField();
		
		btnFibo = new JButton("Trova");
		btnFibo.addActionListener(new GestioneBottoni());
		
		lblResult = new JLabel("Il numero è: ");
		txtResult = new JTextField();
		
		pnlFibo.add(lblMessage);
		pnlFibo.add(txtNumero);
		pnlFibo.add(btnFibo);
		pnlFibo.add(lblResult);
		pnlFibo.add(txtResult);

		//CENTER
		pnlList = new JPanel();
		listModel = new FibonacciListModel();
		previousList = new JList<>(listModel);
		
		pnlList.add(previousList);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlFibo, BorderLayout.NORTH);
		getContentPane().add(pnlList, BorderLayout.CENTER);
		
		setTitle("FibonacciSeries");
		setSize(500, 500);
		
		
	}
	
	private void onClickTrova(int numero){
		
		txtResult.setText(business.findFibo(numero));
		
		listModel.addRow(txtResult.getText());
	}
	
	class GestioneBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int index = Integer.parseInt(txtNumero.getText());
			
			onClickTrova(index);
			
			
		}}

}
