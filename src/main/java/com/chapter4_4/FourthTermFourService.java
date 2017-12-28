package com.chapter4_4;

public class FourthTermFourService extends FourthTermFourAbstract {

	
	//コンストラクタ
	public FourthTermFourService() {
		
	}
	
	
	/** chapter4-4 start *****************************************************************************************/

	//抽象クラスの中身を実装
	@Override
	public void mapValueOutput() {

		System.out.println("------"+"mapValueOutput");
		
		//forEachで全部出す
		System.out.println("------"+"forEachで全部出す");
		this.map.forEach((k,v)->{
			System.out.println(String.format("k = %d / v = %s",k,v));			
		});
		
		//任意の値を出す
		System.out.println("------"+"2番の値を出す");
		Integer selectKey = 2;
		System.out.println(String.format("k = %d / v = %s",selectKey,this.map.get(selectKey)));
		
		//3を置き換え
		System.out.println("------"+"3を置き換えて出す");
		this.map.put(3, "三番");
		selectKey = 3;
		System.out.println(String.format("k = %d / v = %s",selectKey,this.map.get(selectKey)));

		//要素の数
		System.out.println("------"+"要素の数");
		int mapSize = this.map.size();
		System.out.println(String.format("要素の数は = %d",mapSize));
		
		//4を削除
		System.out.println("------"+"4を削除");
		this.map.remove(4);
		selectKey = 4;
		System.out.println(String.format("k = %d / v = %s //削除した要素は参照すると「null」",selectKey,this.map.get(selectKey)));
		
		//存在しないキーを参照
		selectKey = 6;
		System.out.println(String.format("k = %d / v = %s //存在しないキーを参照すると「null」",selectKey,this.map.get(selectKey)));		
		
		//削除後の要素の数
		System.out.println("------"+"削除後の要素の数");
		int mapSizeAfterDelete = this.map.size();
		System.out.println(String.format("要素の数は = %d",mapSizeAfterDelete));
		
		//forEachで全部出す
		System.out.println("------"+"forEachで全部出す");
		this.map.forEach((k,v)->{
			System.out.println(String.format("k = %d / v = %s",k,v));			
		});
	}
	
	@Override
	public void mapExValueOutput() {
		
		//mapValueOutputの逆の処理
		//３番以外を変換する

		System.out.println("------"+"mapExValueOutput");
		
		//forEachで全部出す
		System.out.println("------"+"forEachで全部出す");
		this.map.forEach((k,v)->{
			System.out.println(String.format("k = %d / v = %s",k,v));			
		});
		
		
		//3を置き換え
		System.out.println("------"+"3以外を置き換えて出す");
		for( Integer selectKey = 1; selectKey <= this.map.size(); selectKey++) {
			if(selectKey == 1) {
				this.map.put(selectKey, "一番");
			}
			else if(selectKey == 2) {
				this.map.put(selectKey, "二番");
			}
			else if(selectKey == 4) {
				this.map.put(selectKey, "四番");
			}
			else if(selectKey == 5) {
				this.map.put(selectKey, "五番");
			}
		}
		
		//forEachで全部出す
		System.out.println("------"+"forEachで全部出す");
		this.map.forEach((k,v)->{
			System.out.println(String.format("k = %d / v = %s",k,v));			
		});
	}
	
	
	
	
	
}







