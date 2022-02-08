package org.zefiro.algoritmi.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class SwingVsAwt extends JFrame {

	private JPanel pnlAll;

	private JButton btnSwing;
	private Button btnAwt;

	private JLabel lblSwing;
	private Label lblAwt;
	
	public SwingVsAwt() {
		
		pnlAll = new JPanel(new GridLayout(2,2));
		
		lblSwing = new JLabel();
		lblAwt = new Label();
		
		btnSwing = new JButton();
		btnAwt = new Button();
		btnSwing.setText("Ciao da Swing");
		btnSwing.addActionListener(new GestioneBottoni());
		btnAwt.setLabel("Ciao da Awt");
		btnAwt.addActionListener(new GestioneBottoni());
		
		pnlAll.add(lblSwing);
		pnlAll.add(lblAwt);
		pnlAll.add(btnSwing);
		pnlAll.add(btnAwt);
		
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnlAll, BorderLayout.CENTER);
		
		setTitle("SwingVsAwt");
		setSize(250, 200);
	}
	
	private void onClickAwt(){
		
		lblAwt.setText("Scritta awt");
	}
	
	private void onClickSwing(){
		
		lblSwing.setText("Scritta swing");
	}
	
	class GestioneBottoni implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnSwing) {
			  onClickSwing();
		    }
			
			if(e.getSource() == btnAwt) {
				  onClickAwt();
			}
		}
	}
	

}
   
   
   
