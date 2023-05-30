package org.Department;

import org.college.College;

public class Department extends College {
	
	public void deptName() {
		System.out.println("Computer Science");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department cs=new Department();
		cs.collegeName();
		cs.collegeCode();
		cs.collegeRank();
		cs.deptName();

	}

}
