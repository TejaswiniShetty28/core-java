package de.zeroco.oops;

public class College {
	
	String name;
	String location;
	int establishedYear;
	String affiliation;
	Student[] student;
	int capacity;
	
	public College( Student[] student, String name, int establishedYear, String affiliation, String location, int capacity) {
		student = new Student[capacity];
		this.name = name;
		this.establishedYear = establishedYear;
		this.affiliation = affiliation;
		this.location = location;
	}
	
	public void addStudents(Student[] student) {
	    this.student = student;
	}

	public String getLocation() {
		return location;
	}
	
	public int getEstablishedYear() {
		return establishedYear;
	}
	
	public String getAffiliation() {
		return affiliation;
	}
	
}

