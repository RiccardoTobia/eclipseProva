package org.zefiro.algoritmi.liste;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PlaylistUI extends JFrame {

	//NORTH
	private JPanel pnlNorth;
	private JLabel lblTitolo;
	private JTextField txtTitolo;
	private JLabel lblAutore;
	private JTextField txtAutore;
	private JLabel lblGenere;
	private JTextField txtGenere;
	private JButton btnAggiungi;
	private JButton btnAutore;
	private JButton btnGenere;
	
	//CENTER
	private JPanel pnlCenter;
	private JList songsList;
	private PlaylistListModel listModel;
	private JScrollPane scroll;
	
	
	//BUSINESS
	private Playlist service;
	
	
	public PlaylistUI(){
		
		//North
		pnlNorth = new JPanel(new GridLayout(5,2));
		
		lblTitolo = new JLabel("Insert titolo: ");
		txtTitolo = new JTextField();
		lblAutore = new JLabel("Insert autore: ");
		txtAutore = new JTextField();
		lblGenere = new JLabel("Insert genere: ");
		txtGenere = new JTextField();
		
		btnAggiungi = new JButton("Insert");
		btnAutore = new JButton("Cerca autore");
		btnGenere = new JButton("Cerca genere");
		
		btnAggiungi.addActionListener(new GestioneBottoni());
		btnAutore.addActionListener(new GestioneBottoni());
		btnGenere.addActionListener(new GestioneBottoni());
		
		pnlNorth.add(lblTitolo);
		pnlNorth.add(txtTitolo);
		pnlNorth.add(lblAutore);
		pnlNorth.add(txtAutore);
		pnlNorth.add(lblGenere);
		pnlNorth.add(txtGenere);
		pnlNorth.add(btnAutore);
		pnlNorth.add(btnGenere);
		pnlNorth.add(btnAggiungi);

		//Center
		pnlCenter = new JPanel();
		listModel = new PlaylistListModel();
		songsList = new JList(listModel);
		scroll = new JScrollPane(songsList);
		
		pnlCenter.add(scroll);
		
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlNorth, BorderLayout.NORTH);
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		
		setTitle("Playlist 1.0");
		setSize(300, 300);
		
	}
	
	public void onClickInsert(){
		
		Canzone song = new Canzone(txtTitolo.getText(), txtAutore.getText(), txtGenere.getText(), 350, true);
		
		listModel.insert(song);
		
		txtTitolo.setText("");
		txtAutore.setText("");
		txtGenere.setText("");
		
		txtTitolo.requestFocus();
	}
	
	
	
	class GestioneBottoni implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnAggiungi){
				onClickInsert();
			}			
			
		}
		
	}
	
	
	
	
}
