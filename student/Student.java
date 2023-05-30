package org.student;

import org.Department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Raj Vignesh");
	}
	public void studentDept() {
		System.out.println("Computer Science");
	}
	public void studentId() {
		System.out.println(4567);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.studentName();
		std.studentDept();
		std.studentId();

	}

}
