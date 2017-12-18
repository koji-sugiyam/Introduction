package com.chapter4_4;


import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data

public abstract class FourthTermFourAbstract implements FourthTermFourInterface {
	

	protected Map<Integer,String> map;
	
	//共通的な機能、すなわち今回は、ベースとなるデータの設定は抽象クラスに記述する
	//継承するserviceではこのデータを使うことができる
	
	public void mapInit() {
		
		System.out.println("------"+"mapInit");
		
		//宣言済みのインスタンス変数を使うようにする
		this.map = new HashMap<>();
		this.map.put(1,"one");
		this.map.put(2,"two");
		this.map.put(3,"three");
		this.map.put(4,"four");
		this.map.put(5,"five");

		System.out.println(map);
		System.out.println("------");
		
		//値を出力
		mapValueOutput();
		
		//出力
		mapExValueOutput();
		
	};
	
	//出力処理はservice側で具体的に実装
	public abstract void mapValueOutput();
	

	//出力処理はservice側で具体的に実装
	public abstract void mapExValueOutput();
	
}