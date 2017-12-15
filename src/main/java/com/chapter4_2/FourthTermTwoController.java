package com.chapter4_2;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_2.FourthTermTwoService;

@Controller
@EnableAutoConfiguration
public class FourthTermTwoController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermTwoController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermTwoService service = new FourthTermTwoService();
		
		//4-4-2
		//4-2-1
		//4-2-2
		/*
		 * List ：　配列のようにインデックス指定で使いたい
		 * Set　：　配列で要素の値に重複がない場合
		 * Map　：　連想配列　KVストア
		 * 書籍を読んでね
		 * 
		 */
		
		
		
		return service.CONTROLLER_NAME;

    }


	


	
}






