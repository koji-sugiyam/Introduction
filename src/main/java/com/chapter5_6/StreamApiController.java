package com.chapter5_6;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter5_6.StreamApiService;

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
   String home() {
		
		StreamApiService service = new StreamApiService();

		//5-6-1
		//Streamを使ってListの初期化
		service.firstAction();
		
		//5-6-2
		//Streamを使って値の範囲川リストを作成
		service.secondAction();
		
		//5-6-3
		//Streamを用いて配列を作成
		service.thirdAction();
		
		
		return service.CONTROLLER_NAME;
		
		
		
    }
	
}





