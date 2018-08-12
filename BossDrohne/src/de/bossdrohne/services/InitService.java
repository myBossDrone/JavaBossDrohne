
package de.bossdrohne.services;

import java.awt.EventQueue;

import de.bossdrohne.frontend.MainFrame;

public class InitService {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainFrame();
			}
		});
	}

}
