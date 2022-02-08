package org.zefiro.algoritmi.fizzbuzz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FizzBuzzUI extends JFrame {

	//NORTH
	private JPanel pnlNorth;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JButton btnFizzBuzz;
	
	//CENTER
	private JPanel pnlCenter;
	private JLabel lblResult;
	
	//BUSINESS
	private FizzBuzz repo;
	
	public FizzBuzzUI(){
		
		repo = new FizzBuzz();
		
		//North
		pnlNorth = new JPanel(new GridLayout(1, 3));	
		lblNumero = new JLabel("Inserisci il numero per FizzBuzz: ");
		txtNumero = new JTextField();
		
		btnFizzBuzz = new JButton("FizzBuzz!");
		btnFizzBuzz.addActionListener(new GestionBottoni());
		
		
		pnlNorth.add(lblNumero);
		pnlNorth.add(txtNumero);		
		pnlNorth.add(btnFizzBuzz);
		
		//Center
		pnlCenter = new JPanel();
		lblResult = new JLabel("Prova FizzBuzz");
		
		pnlCenter.setBackground(Color.ORANGE);
		lblResult.setForeground(Color.WHITE);
		
		pnlCenter.add(lblResult);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNorth, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("FizzBuzz|1.0");
		setSize(700, 100);
	}
	
	private void onClick(){
	
		var result = repo.FizzBuzz(txtNumero.getText());
		
		pnlCenter.setBackground(Color.BLUE);
		
		if(result == "ERRORE") {
			
			pnlCenter.setBackground(Color.RED);
			txtNumero.setText("");
			txtNumero.requestFocus();
			
		}
		
		lblResult.setText(result);
	};
	
	
	class GestionBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			onClick();
			
		}
		
		
		
	}
	
}
