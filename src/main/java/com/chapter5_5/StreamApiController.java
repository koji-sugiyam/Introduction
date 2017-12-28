package com.chapter5_5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@EnableAutoConfiguration
public class StreamApiController extends StreamApiService {

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(StreamApiController.class, args);
	}
	
    

	@RequestMapping("/")
	@ResponseBody
    List<String> home() {
		
		StreamApiService service = new StreamApiService();

		
		//5-5-1
		//王道は map、filter、 collect。
		service.firstAction();
		
		//5-5-2
		//n回繰り返しするIntStream
		service.secondAction();
		
		//5-5-3
		//ListやMapに対する効率的な処理
		/*
		 * removeIf : コレクションの全要素に対して条件で要素を削除する
		 * replaceAll : コレクションの全要素に対して任意の処理をして置き換える
		 */
		service.thirdAction();
		
		//お題
		//メンバーリストのメンバーを、「さん」をつけてリストで返してJSON出力
		List<String> memberList = new ArrayList<>();
		memberList = service.getNameList();
		return memberList;
		
		//return service.CONTROLLER_NAME;
		
		
		
    }
	
}





