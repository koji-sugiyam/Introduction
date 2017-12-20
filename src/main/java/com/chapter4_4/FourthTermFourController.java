package com.chapter4_4;


import java.util.Map;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_3.BaseController;
import com.chapter4_4.FourthTermFourService;

@Controller
@EnableAutoConfiguration
public class FourthTermFourController extends BaseController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermFourController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermFourService service = new FourthTermFourService();
		
		
		//Mapの主要メソッド
		/*
		 * put : 要素の追加
		 * putAll : 引数に指定したMap要素をすべて追加する
		 * remove : 要素を削除
		 * clear : すべての要素を削除する
		 * 
		 * get : 指定したキーの要素を取得
		 * size : 要素の数を取得
		 * isEmpty : 空かどうか判定　
		 * entrySet : map内のすべての要素の集合を取得
		 * keySet : map内のすべての要素のキーの集合を取得
		 * values : map内のすべての要素の値のコレクションを取得
		 * 
		 * containsKey : 指定したキーを持つ要素が含まれているか判定　true/false
		 * containsValue : 指定した値の持つ要素が含まれているか判定　true/false
		 * 
		 * forEach : 要素が順次コールバックに渡され、コールバック関数で処理できる。ラムダ式が有効だが、コールバック関数内のブロックで下処理ができない
		 * 　　　　　　　　　　　ブロック外の変数にデータを渡したりする場合は、インスタンス変数（メンバ変数）を使う。
		 * */
	
		
		
		//4-4-1
		//Mapの作成
		//本章では、serviceに宣言済みのインスタンス変数を使うようにする
		service.mapInit();
		
		//4-4-2
		//Mapの使い方
		//Mapに設定した値をループで表示する
		//4-4-1に抽象クラスで追加
	
		//4-4-3
		//テキストの内容を読む
		/* 
		 * Mapインターフェースの実装クラスの種類
		 * ・HashMap
		 * ・LinkedHashMap : 要素を追加した場合の順番を保持する
		 * ・TreeMap : 2分探索木のアルゴリズムで要素をソートするクラス　※アルゴリズムは後日調べる
		 * ・CurrentHashMap : 複数のスレッドからの同時にアクセスされても安全
		 * 
		 */
		
		
		return service.CONTROLLER_NAME;

    }


	
	


	
}






