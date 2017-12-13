package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class ThirdTermTwoSubController extends ThirdTermTwoController  {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermTwoSubController.class, args);
    }

    
	@RequestMapping("/")
    @ResponseBody
    String home() {
		

		System.out.println("親クラスの「say()」を呼び出します。");
		
		//継承している親クラスの関数
		//String interfaceMessage = "変更したメッセージだよん";
		return say(interfaceMessage);
		
		//return say(interfaceMessage);
		
    }
    

    
}





