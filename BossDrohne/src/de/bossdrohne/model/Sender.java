package de.bossdrohne.model;

public class Sender {

	private static Sender sender;
	
	public final int stopSignal = 1;
	public final int startSignal = 2;
	
	public Sender() {
		
	}
	
	public void sendStartSignal() {
		
	}
	
	public void sendStopSignal() {
		
	}
	
	public static Sender getInstance() {
		if(sender == null) {
			sender = new Sender();
		}
		return sender;
	}
	
}
