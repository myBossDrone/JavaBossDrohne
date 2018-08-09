package de.bossdrohne.main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frontend extends JFrame {

	private static final long serialVersionUID = -437139051926418759L;

	private JPanel contentPane = new JPanel(null);
	
	public Frontend() {
		super("BossDrohne");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		init();
		
		pack();
		setVisible(true);
	}
	
	private void init() {
		
		
	}
}
