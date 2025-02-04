package de.zeroco.oops;

public class Client implements Loggable {
	
	String userName;
	String role;
	
	public Client(String userName, String role) {
		this.userName = userName;
		this.role = role;
	}
	
	public String logIfLoggable(Object obj) {
		if (obj instanceof Loggable) {
			return "Can be loggable";
		} else {
			return "Cannot loggable";
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client("Tejaswini", "Software developer");
		System.out.println(client.logIfLoggable(client));
	}
}







