package de.bossdrohne.main;

import java.awt.EventQueue;

public class InitService {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Frontend();
			}
		});
	}

}
