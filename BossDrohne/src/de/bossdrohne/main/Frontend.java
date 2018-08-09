package de.bossdrohne.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frontend extends JFrame {

	private static final long serialVersionUID = -437139051926418759L;

	private JPanel contentPane = new MotionPanel(this);
	private JPanel buttonsPane;
	private JPanel cameraPane = new JPanel(null);
	private JPanel sensorPane = new JPanel(null);
	private JPanel rfidPane = new JPanel(null);
	private JPanel raspberryPane = new JPanel(null);
	private JPanel powerPane = new JPanel(null);
	private JButton bttnKam;
	private JButton bttnSen;
	private JButton bttnRFID;
	private JButton bttnRas;
	private JButton bttnAkk;
	
	private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height - Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration()).bottom;
	
	
	public Frontend() {
		super("BossDrohne");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);
		setResizable(false);
		setUndecorated(true);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(screenWidth, screenHeight));
		setLocation(0, 0);
		
		init();
		
		pack();
		setVisible(true);
	}
	
	private void init() {
		buttonsPane = new JPanel(null);
		buttonsPane.setBounds(0, Double.valueOf(0.9*screenHeight).intValue(), screenWidth, Double.valueOf(0.1*screenHeight).intValue());
		buttonsPane.setBackground(Color.WHITE);
		buttonsPane.setOpaque(true);
		buttonsPane.setVisible(true);
		contentPane.add(buttonsPane);
		
		cameraPane.setBounds(0, 0, screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		cameraPane.setOpaque(true);
		cameraPane.setBackground(Color.BLACK);
		cameraPane.setVisible(false);
		contentPane.add(cameraPane);
		
		contentPane.setBackground(Color.GRAY);
		
		bttnKam = new JButton("Kamera");
		bttnKam.setBounds(0, Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnKam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean state = cameraPane.isVisible();
				cameraPane.setVisible(!state);
			}
		});
		buttonsPane.add(bttnKam);
		
		bttnSen = new JButton("Sensoren");
		bttnSen.setBounds(Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnSen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonsPane.add(bttnSen);
		
		bttnRFID = new JButton("RFID");
		bttnRFID.setBounds(Double.valueOf(0.4*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnRFID.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonsPane.add(bttnRFID);
		
		bttnRas = new JButton("Raspberry Pi");
		bttnRas.setBounds(Double.valueOf(0.6*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnRas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonsPane.add(bttnRas);
		
		bttnAkk = new JButton("Akkustand");
		bttnAkk.setBounds(Double.valueOf(0.8*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnAkk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonsPane.add(bttnAkk);

	}
}
