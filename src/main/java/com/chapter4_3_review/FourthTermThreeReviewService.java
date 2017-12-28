package com.chapter4_3_review;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;


public class FourthTermThreeReviewService extends FourthTermThreeReviewAbstract {


	//コンストラクタ
	public FourthTermThreeReviewService() {
		
	}
	


	//コントローラーからはこれを呼ぶ
	public String reviewRun() {
		
		System.out.println("------"+"review");
		
		//銀行のデータ初期化とチェック　//データの初期化は抽象クラスのコンストラクタで行っている
		ArrayList<String> bankArray = new ArrayList<String>();
		bankArray = getBank();
		bankCheck(bankArray);
		
		//好きな銀行名を発表
		bankFavorite(bankArray);
		
		//特例で残す銀行
		bankLeave(bankArray);
		
		//なくなる銀行一覧取得
		ArrayList<String> bankruptcyArray = new ArrayList<>();
		bankruptcyArray = getBankRuptcyList(bankArray);
				
		//イテレーターでなくなる銀行を削除
		excuteBankRuptcy(bankArray,bankruptcyArray);
		
		//結果
		String resultString = bankResult();
		return resultString;
		
	}
	
	
	

	//抽象クラスからの必須実装
	@Override
	public void bankCheck(ArrayList<String> arrayList) {
		//登録銀行を確認表示する関数
		System.out.println(arrayList);
		System.out.println("--");
	}
	
	
	
	
	//以下はこのクラスでの処理関数
	//好きな銀行
	private void bankFavorite(ArrayList<String> arrayList) {
		System.out.println(String.format("私のすきな銀行は「%s・%s・%s」です。",bankArray.get(0),bankArray.get(5),bankArray.get(7)));
		System.out.println("--");
	}

	//特例で残す銀行
	private void bankLeave(ArrayList<String> arrayList) {
		System.out.println(String.format("特例で残す銀行は「%s」です",bankArray.get(6)));
		System.out.println("--");
	}

	//なくなる銀行一覧取得
	private ArrayList<String> getBankRuptcyList(ArrayList<String> arrayList){
		ArrayList<String> bankruptcyArray = new ArrayList<>();
		bankruptcyArray.add("三菱東京UFJ銀行");
		bankruptcyArray.add("三井住友銀行");
		bankruptcyArray.add("千葉銀行");
		bankruptcyArray.add("千葉興業銀行");
		
		//あえて、forでログメッセージを作成して表示してみる
		String bankruptcyFormatString = "なくなる銀行は「%s」です。";
		String bankruptcyNameString = "";
		for(int i=0; i< bankruptcyArray.size(); i++) {
			bankruptcyNameString += bankruptcyArray.get(i);
			if(i < bankruptcyArray.size()-1) {
				bankruptcyNameString += "・";
				continue;
			}
			else {
				break;
			}
		}
		System.out.println(String.format(bankruptcyFormatString,bankruptcyNameString));
		System.out.println("--");
		
		return bankruptcyArray;
	}

	//イテレーターでなくなる銀行を削除
	private void excuteBankRuptcy(ArrayList<String> bankArray,ArrayList<String> bankruptcyArray) {
		Iterator<String> iterator = bankArray.listIterator();
		while(iterator.hasNext()) {
			String iteratorString = iterator.next();
			for(String bankruptcyName : bankruptcyArray) {
				if(bankruptcyName == iteratorString) {
					iterator.remove();
				}
			}
		}
		
	}
	
	//結果
	public String bankResult(){
		String resultString = String.format("残った銀行は、%sです。",bankArray);
		System.out.println(resultString);
		return resultString;
	}
	
	

	
	
	
	
}







