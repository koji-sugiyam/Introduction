package com.chapter5_4;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter5_4.StreamApiService;

@Controller
@EnableAutoConfiguration
public class StreamApiController extends StreamApiService {

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(StreamApiController.class, args);
	}
    
    

	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		StreamApiService service = new StreamApiService();

		//5-4 Streamに対する終端操作
		
		//5-4-1
		/*
		 * 繰り返し行う終端操作
		 * ・forEach : ストリームに対してループアクションを実行
		 * 
		 */
		service.loopAction();
		
		
		//5-4-2
		/*
		 * 結果をまとめて取り出す処理
		 * ・collect : 要素を走査し結果を作成
		 * ・toArray : 配列に変換
		 * ・reduce : 値を集約
		 */
		service.collectAction();
		service.groupingByAction();
		
		//5-4-3
		/*
		 * 結果を１つだけ取り出す
		 * ・findFirst : 先頭を返す Optional
		 * ・findAny : いずれかを返す Optional
		 * ・min : 最小の要素を返す Optional
		 * ・max : 最大を返す Optional
		 */
		service.findAction();
		
		//コラム
		/*
		 * Optionalとは
		 * objectの参照が「null」かもしれないことを、明示的に表せるようにしたクラス
		 * 詳しくは例外処理で
		 */
		
		//5-4-4
		/*
		 * 集計処理の終端操作
		 * ・count : 要素の個数
		 * ・min : 最小の要素
		 * ・max : 最大の要素
		 * ・sum : 要素の合計値
		 * ・average : 
		 */
		service.aggregateAction();
		
		
		return service.CONTROLLER_NAME;
		
		
		
    }
}





