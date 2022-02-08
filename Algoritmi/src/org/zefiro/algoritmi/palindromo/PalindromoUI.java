package org.zefiro.algoritmi.palindromo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PalindromoUI extends JFrame {
	
	//North
	private JPanel pnlNorth;
	private JTextField txtInput;
	private JButton btnPalindromo;
	
	//Center
	private JPanel pnlCenter;
	private JLabel lblPalindromo;
	
	//Business
	private Palindromo pal;
	
	public PalindromoUI() {
		
		pal = new Palindromo();
		
		//North
		pnlNorth = new JPanel(new GridLayout(1,2));
		txtInput = new JTextField();
		btnPalindromo = new JButton("Palindromo");

		btnPalindromo.addActionListener(new GestioneBottoni());
		
		pnlNorth.add(txtInput);
		pnlNorth.add(btnPalindromo);
		

		//Center
		pnlCenter = new JPanel();
		lblPalindromo = new JLabel();
		
		pnlCenter.add(lblPalindromo);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNorth, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("Palindromo");
		setSize(300,300);
		
	}
	
	void onClickPalindromo(){
		
		if(pal.checkPalindromo(txtInput.getText())){
			lblPalindromo.setText("PALINDROMO");
		} else {
			lblPalindromo.setText("NON PALINDROMO");
		}
	}
	
	class GestioneBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			onClickPalindromo();
			
		}
		
	}

}
