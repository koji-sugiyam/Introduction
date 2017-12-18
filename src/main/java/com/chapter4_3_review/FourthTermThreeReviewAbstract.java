package com.chapter4_3_review;

import java.util.ArrayList;

public abstract class FourthTermThreeReviewAbstract implements FourthTermThreeReviewInterface {
	
	
	//共通的な機能、すなわち今回は、ベースとなるデータの設定は抽象クラスに記述する
	//継承するserviceではこのデータを使うことができる
 
	public ArrayList<String> bankArray;

	//コンストラクタ
	public FourthTermThreeReviewAbstract() {
		
		//基本の銀行データ
		this.bankArray = new ArrayList<String>();
		this.bankArray.add("みずほ銀行");
		this.bankArray.add("三菱東京UFJ銀行");
		this.bankArray.add("三井住友銀行");
		this.bankArray.add("千葉銀行");
		this.bankArray.add("千葉興業銀行");
		this.bankArray.add("京葉銀行");
		this.bankArray.add("イオン銀行");
		this.bankArray.add("楽天銀行");
	}

	//追加したければsetterで
	public void setBank(String bankName){

		this.bankArray.add(bankName);
	}
	
	//取得はgetterで
	public ArrayList<String> getBank(){

		return this.bankArray;
	}

	
	//抽象クラスで仮実装　//詳しくはserviceで
	public abstract void bankCheck(ArrayList<String> arrayList);

	
	
}