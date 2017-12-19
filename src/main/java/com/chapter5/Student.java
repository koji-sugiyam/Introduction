package com.chapter5;

import lombok.Data;

@Data
public class Student{
	
	private String name;
	private Integer score;
	
	//コンストラクタ
	public Student(String name, Integer score) {
		this.name = name;
		this.score = score;
	}

 	/*
 	//setterとgetterはlombokを使って自動生成
 	*/
	
}