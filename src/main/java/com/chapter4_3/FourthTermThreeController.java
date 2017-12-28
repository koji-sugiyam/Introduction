package com.chapter4_3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class FourthTermThreeController extends BaseController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermThreeController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermThreeService service = new FourthTermThreeService();
		
		//まずは軽く復習
		service.lambda();
		
		//4-3-1
		//Listインターフェース
		/*
		 * add ：　要素追加
		 * addAll ：　指定したコレクションのすべての要素を追加
		 * set ：　要素上書き
		 * remove ：　削除
		 * removeAll ：　指定したコレクションに含まれるすべての要素を削除する
		 * retainAll　：　　　　　　　〃　　　　一致しないすべての要素を　〃　　　　　　
		 * clear　：　すべての要素削除
		 * 
		 * get : 取得（obj-cのobjectAtIndex）
		 * size : 要素の数を取得（obj-Cのcount）
		 * isEmpty : 空の判定
		 * subList : 範囲内の要素の取得　list.sublist(0,4)
		 * toArray : 配列に変換
		 * contains : 引数の要素が含まれているか。　返り値：true / false
		 * containsAll : 引数に渡したコレクションの要素がすべて含まれているか　返り値：true / false
		 * indexOf : 指定した引数の要素が最初に見つかった位置
		 * lastIndexOf : 指定した引数の要素が最後に見つかった位置
		 * 
		 * iterator : 繰り返し処理に使うイテレーター
		 * listIterator : 前方処理や変更もできるイテレーター
		 * 
		 * クラス名
		 * ArrayList　：配列を持つ
		 * LinkedArrayList : 要素の順番を保持してくれる
		 * CopyOnWriteArrayList : ArrayListのスレッドセーフ化
		 * 
		 */
		
		
		//4-3-2
		service.makeList();
		
		//4-3-3
		service.listMethodTest();
		
		//4-3-4
		service.listSort();
		
		//4-3-5
		service.listSearch();
		
		//4-3-6
		service.listInteration();
		service.listInterationDelete();
		
		//4-3-7
		//4-3-8
		//テキストを読む
		/*
		 * メモ
		 * 
		 * ArrayList   : index指定での、要素の「取得」「変更」「末尾への追加/削除」が高速。　「途中の要素の追加/削除」が遅い。値の取得向き
		 * LinkedArray : 前後のリンク情報を持っているため、「途中の要素の追加/削除」が高速。しかしindex指定での、要素の「取得」「変更」。ループ処理向き
		 * CopyOnWriteArrayList : スレッドセーフになるが、いちいち配列のコピーを作成するため全性能が遅くなる。
		 */
		
		
		
		return service.CONTROLLER_NAME;

    }


	
	


	
}






