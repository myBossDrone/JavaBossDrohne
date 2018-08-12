package de.bossdrohne.frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = -437139051926418759L;

	private JPanel contentPane = new JPanel(null), taskPane = new JPanel(null);
	private JPanel buttonsPane;
	private JPanel cameraPane = new JPanel(null);
	private JPanel sensorPane = new JPanel(null);
	private JPanel rfidPane = new JPanel(null);
	private JPanel raspberryPane = new JPanel(null);
	private JPanel powerPane = new JPanel(null);
	
	private JButton btnClose;
	
	private JButton bttnKam, bttnSen, bttnRFID, bttnRas, bttnAkk;
	
	private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height - Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration()).bottom;
	
	
	public MainFrame() {
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
		taskPane.setLayout(null);
		taskPane.setBounds(0, 0, screenWidth, Double.valueOf(0.05*screenHeight).intValue());
		taskPane.setBackground(Color.DARK_GRAY);
		contentPane.add(taskPane);
		
		buttonsPane = new JPanel(null);
		buttonsPane.setBounds(0, Double.valueOf(0.9*screenHeight).intValue(), screenWidth, Double.valueOf(0.1*screenHeight).intValue());
		buttonsPane.setBackground(Color.WHITE);
		buttonsPane.setOpaque(true);
		buttonsPane.setVisible(true);
		contentPane.add(buttonsPane);
		
		cameraPane.setBounds(0, Double.valueOf(0.05*screenHeight).intValue(), screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		cameraPane.setOpaque(true);
		cameraPane.setBackground(Color.BLACK);
		cameraPane.setVisible(false);
		contentPane.add(cameraPane);
		
		rfidPane.setBounds(0, Double.valueOf(0.05*screenHeight).intValue(), screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		rfidPane.setOpaque(true);
		rfidPane.setBackground(Color.BLUE);
		rfidPane.setVisible(false);
		contentPane.add(rfidPane);
		
		sensorPane.setBounds(0, Double.valueOf(0.05*screenHeight).intValue(), screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		sensorPane.setOpaque(true);
		sensorPane.setBackground(Color.RED);
		sensorPane.setVisible(false);
		contentPane.add(sensorPane);
		
		powerPane.setBounds(0, Double.valueOf(0.05*screenHeight).intValue(), screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		powerPane.setOpaque(true);
		powerPane.setBackground(Color.YELLOW);
		powerPane.setVisible(false);
		contentPane.add(powerPane);
		
		raspberryPane.setBounds(0, Double.valueOf(0.05*screenHeight).intValue(), screenWidth, Double.valueOf(0.9*screenHeight).intValue());
		raspberryPane.setOpaque(true);
		raspberryPane.setBackground(Color.MAGENTA);
		raspberryPane.setVisible(false);
		contentPane.add(raspberryPane);
		
		contentPane.setBackground(Color.GRAY);
		
		bttnKam = new JButton("Kamera");
		bttnKam.setBounds(0, Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnKam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cameraPane.isVisible()) {
					cameraPane.setVisible(false);
				} else {
					rfidPane.setVisible(false);
					sensorPane.setVisible(false);
					raspberryPane.setVisible(false);
					powerPane.setVisible(false);
					cameraPane.setVisible(true);
				}
			}
		});
		buttonsPane.add(bttnKam);
		
		bttnSen = new JButton("Sensoren");
		bttnSen.setBounds(Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnSen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(sensorPane.isVisible()) {
					sensorPane.setVisible(false);
				} else {
					rfidPane.setVisible(false);
					cameraPane.setVisible(false);
					raspberryPane.setVisible(false);
					powerPane.setVisible(false);
					sensorPane.setVisible(true);
				}
			}
		});
		buttonsPane.add(bttnSen);
		
		bttnRFID = new JButton("RFID");
		bttnRFID.setBounds(Double.valueOf(0.4*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnRFID.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rfidPane.isVisible()) {
					rfidPane.setVisible(false);
				} else {
					raspberryPane.setVisible(false);
					cameraPane.setVisible(false);
					sensorPane.setVisible(false);
					powerPane.setVisible(false);
					rfidPane.setVisible(true);
				}
			}
		});
		buttonsPane.add(bttnRFID);
		
		bttnRas = new JButton("Raspberry Pi");
		bttnRas.setBounds(Double.valueOf(0.6*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnRas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(raspberryPane.isVisible()) {
					raspberryPane.setVisible(false);
				} else {
					rfidPane.setVisible(false);
					cameraPane.setVisible(false);
					sensorPane.setVisible(false);
					powerPane.setVisible(false);
					raspberryPane.setVisible(true);
				}
			}
		});
		buttonsPane.add(bttnRas);
		
		bttnAkk = new JButton("Akkustand");
		bttnAkk.setBounds(Double.valueOf(0.8*buttonsPane.getWidth()).intValue(), Double.valueOf(0.15*buttonsPane.getHeight()).intValue(), Double.valueOf(0.2*buttonsPane.getWidth()).intValue(), Double.valueOf(0.7*buttonsPane.getHeight()).intValue());
		bttnAkk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(powerPane.isVisible()) {
					powerPane.setVisible(false);
				} else {
					rfidPane.setVisible(false);
					cameraPane.setVisible(false);
					sensorPane.setVisible(false);
					raspberryPane.setVisible(false);
					powerPane.setVisible(true);
				}
			}
		});
		buttonsPane.add(bttnAkk);
		
		btnClose = new JButton("x");
		btnClose.setBounds(0, 0, taskPane.getHeight(), taskPane.getHeight());
		btnClose.setFont(btnClose.getFont().deriveFont(18f));
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		taskPane.add(btnClose);
	}
}
