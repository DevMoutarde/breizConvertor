package breizConvertor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Vue {

	public JFrame frame;
	private JButton input;
	private JLabel lblNombreDeLignes;
	private JLabel nombreLigne;
	private JLabel lblFichierSortie;
	private JButton btnOutput;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Vue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		this.input = new JButton("input");
		
		
		JLabel lblFichierEntre = new JLabel("FIchier entr\u00E9e:");
		
		lblNombreDeLignes = new JLabel("Nombre de lignes: ");
		
		nombreLigne = new JLabel("");
		
		lblFichierSortie = new JLabel("Fichier sortie");
		
		btnOutput = new JButton("Output");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNombreDeLignes)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nombreLigne))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblFichierEntre)
							.addGap(29)
							.addComponent(input)
							.addGap(80)
							.addComponent(lblFichierSortie)
							.addGap(18)
							.addComponent(btnOutput)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(input)
						.addComponent(lblFichierEntre)
						.addComponent(lblFichierSortie)
						.addComponent(btnOutput))
					.addPreferredGap(ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombreDeLignes)
						.addComponent(nombreLigne))
					.addGap(24))
		);
		panel.setLayout(gl_panel);
	}

	public JButton getInput() {
		return input;
	}

	public void setInput(JButton input) {
		this.input = input;
	}

	public JLabel getNombreLigne() {
		return nombreLigne;
	}

	public void setNombreLigne(JLabel nombreLigne) {
		this.nombreLigne = nombreLigne;
	}

	public JButton getBtnOutput() {
		return btnOutput;
	}

	public void setBtnOutput(JButton btnOutput) {
		this.btnOutput = btnOutput;
	}
	
	
	
	
	
	
	
	
	
}
