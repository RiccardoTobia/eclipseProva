package org.zefiro.algoritmi.invertistringa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvertiStringaUI extends JFrame {
	
	//North
	private JPanel pnlNorth;
	private JTextField txtInput;
	private JButton btnInverti;
	private JButton btnReset;
	
	//Center
	private JPanel pnlCenter;
	private JLabel lblResult;
	private JLabel lblEtichetta;
	
	private InvertiStringa repo;
	
	public InvertiStringaUI(){
		
		repo = new InvertiStringa();
		
		//North
		pnlNorth = new JPanel(new GridLayout(1,2));
		txtInput = new JTextField();
		btnInverti = new JButton("Inverti");
		btnInverti.addActionListener(new GestioneBottoni());
		
		pnlNorth.add(txtInput);
		pnlNorth.add(btnInverti);
		
		//Center
		pnlCenter = new JPanel(new GridLayout(1,2));
		lblResult = new JLabel();
		lblEtichetta = new JLabel("Parola invertita: ");
		
		pnlCenter.add(lblEtichetta);
		pnlCenter.add(lblResult);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNorth, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("InvertiStringa");
		setSize(300,300);
	}
	
	private void onClickInverti() {
		String invertita = repo.inverti(txtInput.getText());
		
		lblResult.setText(invertita);
	}
	
	class GestioneBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			onClickInverti();
			
		}
		
	}
}
