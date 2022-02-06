package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Student Name: \t Shanmathy Muruganandam");
	}
	public void studentId() {
		System.out.println("Student ID: \t 12");
	}
	public void studentDept() {
		System.out.println("Student Dept: \t PED ");
	}
	public static void main(String[] args) {
		College clg = new College();
		Department dept = new Department();
		Student std = new Student();
		std.studentName();
		clg.collegeCode();
		clg.collegeName();
		clg.collegeRank();
		dept.deptName();
		std.studentDept();
		std.studentId();
	}

}
