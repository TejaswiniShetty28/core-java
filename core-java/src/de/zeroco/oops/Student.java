package de.zeroco.oops;

public class Student {
	
	String name;
	int age;
	int studentId;
	String course;
	char grade;
	
	public Student(String name, int age, int studentId, String course, char grade) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.course = course;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getCourse() {
		return course;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public static void main(String[] args) {
		Student student = new Student("Tejaswini", 18, 50, "EEE", 'A');
		System.out.println(student.getAge());
		System.out.println(student.getStudentId());
		System.out.println(student.getCourse());
		System.out.println(student.getGrade());
	}

}
