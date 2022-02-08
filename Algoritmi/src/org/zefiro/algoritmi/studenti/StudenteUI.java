package org.zefiro.algoritmi.studenti;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudenteUI extends JFrame {
	
	// NORD
	private JPanel pnlNord;
	private JLabel lblMateria;
	private JTextField txtMateria;
	private JLabel lblVoto;
	private JTextField txtVoto;
	private JLabel lblData;
	private JTextField txtData;
	private JLabel lblCrediti;
	private JTextField txtCrediti;
	private JButton btnAdd;
	private JButton btnCalcola;
	
	// CENTER
	private JPanel pnlCenter;
	private JLabel lblEsame;
	private JLabel lblVediMateria;
	private JLabel lblVediCrediti;
	private JLabel lblVediVoto;
	private JLabel lblResult;
	private JLabel lblMedia;
	private JLabel lblResultPond;
	private JLabel lblMediaPond;
	
	// Model
	private Studente s = new Studente();
	
	public StudenteUI() {
		
		//Nord 
		pnlNord = new JPanel(new GridLayout(6,2));
		
		lblMateria = new JLabel("MATERIA: ");
		txtMateria = new JTextField();

		lblData = new JLabel("Data: ");
		txtData = new JTextField();
		
		lblCrediti = new JLabel("CREDITI: ");
		txtCrediti = new JTextField();
		
		lblVoto = new JLabel("VOTO: ");
		txtVoto = new JTextField();
		
		btnAdd = new JButton("Inserisci l'esame");
		btnCalcola = new JButton("Calcola media");
		
		btnAdd.addActionListener(new GestioneBottoni());
		btnCalcola.addActionListener(new GestioneBottoni());

		pnlNord.add(lblMateria);
		pnlNord.add(txtMateria);
		pnlNord.add(lblData);
		pnlNord.add(txtData);
		pnlNord.add(lblCrediti);
		pnlNord.add(txtCrediti);
		pnlNord.add(lblVoto);
		pnlNord.add(txtVoto);
		pnlNord.add(btnAdd);
		pnlNord.add(btnCalcola);
		
		//Center
		
		pnlCenter = new JPanel(new GridLayout(2, 6));
		
		lblEsame = new JLabel("Ultimo esame inserito: ");
		lblVediMateria = new JLabel();
		lblVediCrediti = new JLabel();
		lblVediVoto = new JLabel();
		lblResult = new JLabel("Media: ");
		lblMedia = new JLabel();
		lblResultPond = new JLabel("Media ponderata: ");
		lblMediaPond = new JLabel();
		
		pnlCenter.add(lblEsame);
		pnlCenter.add(lblVediMateria);
		pnlCenter.add(lblVediCrediti);
		pnlCenter.add(lblVediVoto);
		pnlCenter.add(lblResult);
		pnlCenter.add(lblMedia);
		pnlCenter.add(lblResultPond);
		pnlCenter.add(lblMediaPond);

		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNord, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("MEDIACALCULATOR | 0.1");
		setSize(600,450);
		
	}
	
	private int tryParseInt(String input, int defaultVal) {
	    try {
	    	
	    	int n = Integer.parseInt(input);
	    	if (n > 0) {
	         return n;
	    	} else
	    		return defaultVal;
	    } catch (NumberFormatException e) {
	    	
	        return defaultVal;
	    }
	}
	
	
     public void onClickAdd(){
    	 
    	 int crediti=tryParseInt(txtCrediti.getText(), -999);
    	 int voto=tryParseInt(txtVoto.getText(), -999);
    	 
    	 if(crediti == -999 || voto == -999) {
    		 System.out.println(crediti == -999 ? "crediti deve essere un numero" : "voto deve essere un numero");
    	 } else {
    		 
    		 Esame e = new Esame(txtMateria.getText(), txtData.getText(), voto, crediti);
    		 s.addEsame(e);
    		 
    		 lblVediMateria.setText(e.getTitolo());
    		 lblVediCrediti.setText("" + crediti);
    		 lblVediVoto.setText("" + voto);
    		 
    		 txtMateria.setText("");
    		 txtMateria.requestFocus();
    		 txtData.setText("");
    		 txtCrediti.setText("");
    		 txtVoto.setText("");
    		 
    	 }
    	 
    	 
     }

     public void onClickCalcola(){
    	 
    	 lblMedia.setText("" + s.getMedia());
    	 lblMediaPond.setText("" + s.getMediaPonderata());

     }

	class GestioneBottoni implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnAdd) {
			onClickAdd();
		} 

		if(e.getSource() == btnCalcola) {
			onClickCalcola();
		} 
		
	}
  }
}


