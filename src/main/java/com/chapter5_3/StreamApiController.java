package com.chapter5_3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter5_3.StreamApiService;

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

		//Streamに対する中間操作
		
		//5-3-1
		//map要素を置き換える中間操作
		/*
		 * メソッド名に「map」が入っている中間操作は要素を置き換えることを目的としている
		 * ・map : 要素を別の値に置き換える
		 * ・mapYoInt : 要素をint値に置き換える
		 * ・mapToDouble : 要素をdouble値に置き換える
		 * ・mapToLong : 要素をlong型に置き換える
		 * ・flatMap : 要素のStreamを結合する
		 */
		//map
		service.replaceMapStream();
		
		//flatMap //複数「map」をマージして処理する
		//エラーではまる
		//service.mergeMapStream();

		
		//5-3-2
		//要素を絞り込む中間操作
		/*
		 * filter　：指定文字か正規表現マッチ
		 * limit　:指定回数
		 * distinct : ユニークな要素にのみ＝重複は表示しない
		 */
		service.filterMapStream();
		
		
		
		return service.CONTROLLER_NAME;
		
		
		
    }
	
}





