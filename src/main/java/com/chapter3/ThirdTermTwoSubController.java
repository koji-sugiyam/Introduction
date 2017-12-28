package com.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
		

		System.out.println("インターフェースの定数は" + INTERFACE_MESSAGE);
		
		
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





