package com.chapter4_5;




import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_5.FourthTermFiveService;

@Controller
@EnableAutoConfiguration
public class FourthTermFiveController {

    
    //spring
    public static void main(String... args) throws Exception {
    	SpringApplication.run(FourthTermFiveController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermFiveService service = new FourthTermFiveService();
		
		//Setインターフェースは値の集合を扱うインターフェース
		
		//Setインターフェースの主要メソッド
		/*
		 * ・add : 引数に渡した要素を、Setに追加
		 * ・addAll : 引数のコレクションのすべての要素を追加
		 * ・remove : 引数に指定した要素を、setから削除
		 * ・removeAll : 引数に指定したコレクションに含まれる要素を、setから削除
		 * ・retainAll : 一致しない要素のの削除
		 * ・clear : すべての要素を削除
		 * 
		 * ・size : 要素数の取得
		 * ・isEmpty : setに要素がないかどうか判別　true / false
		 * ・toArray : set内の要素を配列として取得
		 * 
		 * ・contains : 引数で渡した要素が、setに含まれているか検索
		 * ・containsAll : 引数で渡したコレクションのすべての要素が、setに含まれているか検索
		 * 
		 * ・iterator : イテレーターの取得
		 * 
		 */
		
		//Setインターフェースの実装クラス
		/*
		 * ・HashSet : 標準的なクラス
		 * ・LinkedHashSet : 前後関係を保持できるクラス
		 * ・TreeSet : 2分探索木アルゴリズムで並び替えを行うクラス
		 */
		
		
		//4-5-1
		//setの初期化
		service.initSet();
		
		//コレクションをSetに変換する
		//重複する要素がなくなる
		service.convertCollectionToSet();
		
		//配列をSetに変換する
		service.convertArrayToSet();

		//4-5-2
		//Setの使い方
		service.useSet();
		
		//4-5-3
		//Setの使い方を理解する
		//テキストを読む
		/*
		 * ・HashSet
		 * ・LinkedHashSet : 前後関係を保持する
		 * ・TreeSet : 2分探索木のアルゴリズムでソートするクラス
		 * 
		 * 複数のスレッドからアクセスされる場合に、無限ループに陥る場合があるので、
		 * 可能性がある場合は「synchronized」を使う、もしくは、「ConcurrentHashMap」からSetを作成してを使う。
		 */
		
		
		
		
		
		
		return service.CONTROLLER_NAME;

    }
}





