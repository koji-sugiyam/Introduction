package com.chapter4;

import lombok.Data;

@Data
class Student{
	
	protected String name;
	protected Integer score;
	
	public Student(String name, Integer score) {
		this.name = name;
		this.score = score;
	}

 	/*
 	//setterとgetterはlombokを使って自動生成
 	*/
	
}