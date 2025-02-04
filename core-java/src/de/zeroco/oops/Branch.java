package de.zeroco.oops;

public class Branch {
	
	String branch;
	String name;
	int id;
	
	public Branch(String branch, String name, int id) {
		this.branch = branch;
		this.name = name;
		this.id = id;
	}
	
	public String branch() {
		return "Please tell which branch u belong to";
	}
	
	public String name() {
		return " My name is Mr.Ram";
	}
	
	public int id() {
		return id;
	}
	
}
