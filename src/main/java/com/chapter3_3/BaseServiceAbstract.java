package com.chapter3_3;

public abstract class BaseServiceAbstract implements BaseServiceInterface {
	
	//インスタンス変数
	protected String name;
	
	//コンストラクタ
	public BaseServiceAbstract(String name) {
		this.name = name;
	}
	
	
}