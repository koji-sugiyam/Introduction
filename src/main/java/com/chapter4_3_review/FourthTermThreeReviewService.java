package com.chapter4_3_review;

import java.util.ArrayList;
import java.util.Iterator;


public class FourthTermThreeReviewService extends FourthTermThreeReviewAbstract {

	
	//コンストラクタ
	public FourthTermThreeReviewService() {
		
	}
	

	//抽象クラスからの必須実装
	@Override
	public void bankCheck(ArrayList<String> arrayList) {
		//登録銀行を確認表示する関数
		System.out.println(arrayList);
		System.out.println("--");
	}
	
	
	//コントローラーからはこれを呼ぶ
	public void reviewRun() {
		
		System.out.println("------"+"review");
		
		//銀行のデータ初期化とチェック　//データの初期化は抽象クラスのコンストラクタで行っている
		ArrayList<String> bankArray = new ArrayList<String>();
		bankArray = getBank();
		bankCheck(bankArray);
		
		
		//好きな銀行名を発表
		System.out.println(String.format("私のすきな銀行は「%s・%s・%s」です。",bankArray.get(0),bankArray.get(5),bankArray.get(7)));
		System.out.println("--");
		
		//特例で残す銀行
		System.out.println(String.format("特例で残す銀行は「%s」です",bankArray.get(6)));
		System.out.println("--");
		
		//なくなる銀行
		ArrayList<String> bankruptcyArray = new ArrayList<>();
		bankruptcyArray.add("三菱東京UFJ銀行");
		bankruptcyArray.add("三井住友銀行");
		bankruptcyArray.add("千葉銀行");
		bankruptcyArray.add("千葉興業銀行");
		
		//あえて、forでメッセージを作成してみる
		String bankruptcyNameString = "なくなる銀行は「";
		for(int i=0; i< bankruptcyArray.size(); i++) {
			bankruptcyNameString += bankruptcyArray.get(i);
			if(i < bankruptcyArray.size()-1) {
				bankruptcyNameString += "・";
			}
			else {
				bankruptcyNameString += "」です。";
			}
		}
		System.out.println(String.format(bankruptcyNameString));
		System.out.println("--");
				
		//イテレーターでなくなる銀行を削除
		Iterator<String> iterator = bankArray.listIterator();
		while(iterator.hasNext()) {
			String iteratorString = iterator.next();
			for(String bankruptcyName : bankruptcyArray) {
				if(bankruptcyName == iteratorString) {
					iterator.remove();
				}
			}
		}
		System.out.println(String.format("残った銀行は、%sです。",bankArray));
		
		System.out.println("------");
		
		
	}
	

	
	
	
	
}







