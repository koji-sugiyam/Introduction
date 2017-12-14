package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class ThirdTermTwoSubController extends ThirdTermTwoController {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermTwoSubController.class, args);
    }

    
	@RequestMapping("/")
    @ResponseBody
    String home() {
		

		System.out.println("親クラスの「say()」を呼び出します。");
		

		System.out.println("インターフェースの定数は" + interfaceMessage);
		
		
		//そのまま親クラスの関数を実行
		//1回目は親クラスでの初期値が表示
		say(message);
		//2回目以降は ↓ で書き換えたメッセージ
		
		//継承している親クラスの変数を書き換え
		message = "子クラスからのメッセージ。";

		//親クラスがimplementsしている関数
		say(message);
		
		//オーバーロードもできる
		say(message,"杉山さんへ、","オーバーロード");

		System.out.println("--------------");
		
		return  "ThirdTermTwoSubController";
    }
    
	
	//子クラスで親クラスのインターフェースの関数をオーバーライドもできる
	@Override
	public String say(String message) {

		System.out.println(message + "Overrideメッセージです");
		return message;
	}

	//オーバーロード
	public String say(String message, String name, String overload) {

		System.out.println(name + message + overload + "メッセージです");
		return message;
	}

    
}





