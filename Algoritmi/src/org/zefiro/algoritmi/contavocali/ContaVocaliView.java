package org.zefiro.algoritmi.contavocali;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContaVocaliView extends JFrame {

	private JPanel pnlApp;
	private JTextField txtParola;
	private JTextField txtRisultato;
	private JButton btnCalcola;
	private JButton btnReset;
	private JLabel lblParola;
	private JLabel lblRisultato;
	
	//Business
	private ContaVocali conta;
	
	public ContaVocaliView() {
		
		conta = new ContaVocali();
		
		pnlApp = new JPanel(new GridLayout(2,3));
		
		txtParola = new JTextField();
		txtRisultato = new JTextField();
		
		btnCalcola = new JButton("Calcola");
		btnReset = new JButton("Reset");
		
		btnCalcola.addActionListener(new GestioneBottoni());
		btnReset.addActionListener(new GestioneBottoni());
		
		lblParola = new JLabel("Inserisci la parola: ");
		lblRisultato = new JLabel("Numero di vocali: ");
		
	
		pnlApp.add(lblParola);
		pnlApp.add(txtParola);
		pnlApp.add(btnCalcola);
		pnlApp.add(lblRisultato);
		pnlApp.add(txtRisultato);
		pnlApp.add(btnReset);
		
		getContentPane().add(pnlApp);
		
		setTitle("ContaVocali | 1.0");
		setSize(400, 150);
		
	}

	public void onClickConta(){
		
		String word = txtParola.getText();
		txtRisultato.setText(Integer.toString(conta.contare(word)));
		
	}
	
	public void onClickReset() {
		
		txtParola.setText("");
		txtRisultato.setText("");
		
	}
	
	class GestioneBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnCalcola) {
				onClickConta();
			}
			
			if(e.getSource() == btnReset) {
				onClickReset();
			}
		}
	 }
	
}
	
