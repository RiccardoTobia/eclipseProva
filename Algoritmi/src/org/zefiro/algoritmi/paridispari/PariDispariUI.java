package org.zefiro.algoritmi.paridispari;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PariDispariUI extends JFrame {
	
	//North
	private JPanel pnlNorth;
	private JLabel lblInsert;
	private JTextField txtNumero;
	private JButton btnPariDispari;
	
	//Center
	private JPanel pnlCenter;
	private JLabel lblResult;
	
	//Business
	private PariDispari pd;
	
	public PariDispariUI() {
		
		pd = new PariDispari();
		
		//North
		pnlNorth = new JPanel(new GridLayout(1,3));
		lblInsert = new JLabel("Inserisci il numero:");
		txtNumero = new JTextField();
		btnPariDispari = new JButton("Vai");
		btnPariDispari.addActionListener(new GestioneBottoni());
		
		pnlNorth.add(lblInsert);
		pnlNorth.add(txtNumero);
		pnlNorth.add(btnPariDispari);
		
		//Center
		pnlCenter = new JPanel();
		pnlCenter.setBackground(Color.ORANGE);
		lblResult = new JLabel("BENVENUTO",SwingConstants.CENTER);
		lblResult.setForeground(Color.WHITE);
		
		pnlCenter.add(lblResult);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNorth, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("Paridispari");
		setSize(500,300);
	}
	
	
	private void onClickPariDispari() {
		int conversione = pd.tryParse(txtNumero.getText(), -9999999);
		
		if(conversione == -9999999) {
			lblResult.setText("DEVI INSERIRE UN NUMERO");
			pnlCenter.setBackground(Color.RED);
			txtNumero.setText("");
			txtNumero.requestFocus();
		} else {
			
			if(pd.isPari(conversione)){
				lblResult.setText("PARI");
				pnlCenter.setBackground(Color.GREEN);
			} else {
				lblResult.setText("DISPARI");
				pnlCenter.setBackground(Color.BLUE);

			}
			
			
		}
		
		
	}
	
	class GestioneBottoni implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			onClickPariDispari();
		}
		
	}

}
