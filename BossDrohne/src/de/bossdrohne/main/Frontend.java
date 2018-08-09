package de.bossdrohne.main;

import javax.swing.*;
import java.awt.*;

public class Frontend extends JFrame {

	private static final long serialVersionUID = -437139051926418759L;

	private JPanel contentPane = new JPanel(null);
	private JPanel buttons = new JPanel();
	private JPanel camera = new JPanel();
	private JPanel sensor = new JPanel();
	private JPanel rfid = new JPanel();
	private JPanel raspberry = new JPanel();
	private JPanel power = new JPanel();
	private JButton bttnKam = new JButton("Kamera");
	private JButton bttnSen = new JButton("Sensoren");
	private JButton bttnRFID = new JButton("RFID");
	private JButton bttnRas = new JButton("Raspberry Pi");
	private JButton bttnAkk = new JButton("Akkustand");
	
	
	public Frontend() {
		super("BossDrohne");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("myBossDrohne Fernsteuerung");
		setLayout(new BorderLayout());
		
		init();
		
		pack();
		setVisible(true);
	}
	
	private void init() {
		initButtons();
		initCam();
	}
	
	private void initButtons() {
		//test
		add(buttons, BorderLayout.PAGE_END);
		buttons.add(bttnKam);
		buttons.add(bttnSen);
		buttons.add(bttnRFID);
		buttons.add(bttnRas);
		buttons.add(bttnAkk);
		buttons.setLayout(new FlowLayout());
		buttons.setVisible(true);
	}
	
	private void initCam() {
		
		add(camera, BorderLayout.PAGE_START);
		camera.setPreferredSize(new java.awt.Dimension(250, 700));
		camera.setOpaque(true);
		camera.setBackground(new Color(0,0,0));
		camera.setVisible(bttnCamPressed());
		
	}
	
	private boolean bttnCamPressed() {
		
		return true;
		
	}
}
