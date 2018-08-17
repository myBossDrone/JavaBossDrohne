package de.bossdrohne.services;

public class GPIOManager {
	
	private static GPIOManager gpio;
	
	public GPIOManager() {
		
	}
	
	public static GPIOManager getInstance() {
		if(gpio == null) {
			gpio = new GPIOManager();
		}
		return gpio;
	}

}
