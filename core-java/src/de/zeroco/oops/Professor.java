package de.zeroco.oops;

public class Professor extends Branch {
	
	public Professor(String branch, String name, int id) {
		super(branch, name, id);
	}
	
	@Override
	public String branch() {
		return branch;
	}
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public int id() {
		return id;
	}
	
	public static void main(String[] args) {
		Professor professor = new Professor("EEE", "Nrusimha", 21);
		System.out.println(professor.branch());
		System.out.println(professor.id());
		System.out.println(professor.name());
	}
	
}
