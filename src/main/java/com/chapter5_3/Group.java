package com.chapter5_3;

import java.util.List;

import com.chapter5.Student;

public class Group {
	
	private List<Student> students;
	
	public void add(Student student) {
		this.students.add(student);
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
}