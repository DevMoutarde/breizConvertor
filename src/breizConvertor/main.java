package breizConvertor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;



public class main {
	
	

	public static void main(String[] args) {
		System.out.println("test");
		Vue vue = new Vue();
		vue.frame.setVisible(true);
		
		vue.getInput().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("bouton");
			}
		});

		String cheminInput = "";
		JFileChooser rechercheFichier = new JFileChooser();
		int returnVal = rechercheFichier.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            rechercheFichier.getSelectedFile().getAbsolutePath());
	       cheminInput = rechercheFichier.getSelectedFile().getAbsolutePath();
	    }
	    
	    
		Parser parser = new Parser();
		parser.lireFichier(cheminInput);
		vue.getNombreLigne().setText(""+parser.getCount());
		
		
		
		
		
		vue.getBtnOutput().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Ecriture ecriture = new Ecriture(vue, parser.getLignes());
				try {
					ecriture.setPath();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	
}



