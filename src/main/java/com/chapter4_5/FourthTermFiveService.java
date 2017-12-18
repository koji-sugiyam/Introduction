package com.chapter4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.*;
import java.util.Collection;

public class FourthTermFiveService extends FourthTermFiveAbstract {
	
	
	public Set<Integer> integerSet;
	
	//コンストラクタ
	public FourthTermFiveService() {
		
		
	}


	public void initSet() {

		this.integerSet = new HashSet<>();
		
	}
	
	public void convertCollectionToSet() {
		
		//仮のデータ　 コレクション
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(62);
		integerList.add(31);
		integerList.add(1);
		integerList.add(54);
		integerList.add(31);
		System.out.println(String.format("List : %s",integerList));
		
		//変換してみる
		this.integerSet = new HashSet<>(integerList);
		System.out.println(String.format("Set  : %s",this.integerSet));
	}
	
	public void convertArrayToSet() {
		
		//仮のデータ　配列
		int[] integerArray = new int[] {1,62,31,1,54,31};
		System.out.println(String.format("Array : %s",integerArray));
		/*
		//変換してみる  int配列は本の通りでは変換できない　後で調べる
		List<Integer> integerList = Arrays.asList(integerArray);
		
		Set<Integer>.integerSet = new HashSet<>(integerList);
		System.out.println(String.format("Set  : %s",this.integerSet));
		 */

	}
	
	public void useSet() {
		
		Set<String> names = new HashSet<>();
		
		//データ追加
		names.add("ken");
		names.add("shin");
		names.add("takuya");
		names.add("sugi");
		//重複は追加されない
		names.add("sugi");
		names.add("sugi");
		names.add("sugi");
		System.out.println(String.format("Setの中身 : %s", names.toString()));
		
		
		//順番を保持したければLinkedHashSet
		Set<String> namesLinked = new LinkedHashSet<>();
		
		//データ追加
		namesLinked.add("ken");
		namesLinked.add("shin");
		namesLinked.add("takuya");
		namesLinked.add("sugi");
		//重複は追加されない
		namesLinked.add("sugi");
		namesLinked.add("takuya");
		namesLinked.add("shin");
		System.out.println(String.format("Setの中身 : %s", namesLinked.toString()));
		

		
		//こっちにするとスレッドセーフになる
		//ただし、前後関係は保持されない
		Set<String> namesThreadSafe = Collections.newSetFromMap(new ConcurrentHashMap<String,Boolean>());

		//データ追加
		namesThreadSafe.add("ken");
		namesThreadSafe.add("shin");
		namesThreadSafe.add("takuya");
		namesThreadSafe.add("sugi");
		//重複は追加されない
		namesThreadSafe.add("sugi");
		namesThreadSafe.add("takuya");
		namesThreadSafe.add("shin");
		System.out.println(String.format("Setの中身 : %s", namesThreadSafe.toString()));
		System.out.println("--");
		
		
		//上書き //存在するものを上書きされない
		namesThreadSafe.add("sugi");
		namesThreadSafe.add("koji");
		System.out.println(String.format("Setの上書き : %s", namesThreadSafe.toString()));
		System.out.println("--");
		
		//削除
		namesThreadSafe.remove("sugi");
		System.out.println(String.format("Setの削除 : %s", namesThreadSafe.toString()));
		System.out.println("--");
		
		//要素数
		System.out.println(String.format("Setの要素数 : %d", namesThreadSafe.size()));
		System.out.println("--");
		
		//検索
		if(namesThreadSafe.contains("koji")) {
			System.out.println(String.format("kojiの検索 : %b",namesThreadSafe.contains("koji")));
			System.out.println("--");
		}
		if(!namesThreadSafe.contains("sugi")) {
			System.out.println(String.format("sugiの検索 : %b",namesThreadSafe.contains("sugi") ));
			System.out.println("--");
		}
		
		
	}


	
	
	
}

