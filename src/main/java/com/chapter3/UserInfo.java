package com.chapter3;

public class UserInfo{
	
	/*
	  //staticならどこからでも呼び出せるクラスメンバになるので複数インスタンス化した時に困る
	  protected static String name;
	  
	  //finalは変更禁止になる
	  protected static String name="杉山";
	  
	  //これなら子クラスから呼び出せて、複数インスタンス化しても大丈夫
	  protected String name;
	 */
	
	protected String name;
	protected Integer age;
	
	//コンストラクタ
	//コンストラクタはクラスと同じ名前にする
	//コンストラクタはオーバーロードで引数が違う場合も個別に作れる
	UserInfo(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	UserInfo(String name){
		this.name = name;
	}
	UserInfo(Integer age){
		this.age = age;
	}
	UserInfo(){
	}
	
	
	//getter //setter
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}

	void setAge(Integer age) {
		this.age = age;
	}
	Integer getAge() {
		return this.age;
	}


}