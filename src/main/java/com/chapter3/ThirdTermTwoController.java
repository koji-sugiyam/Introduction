package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


import com.chapter3.UserInfo;

@Controller
@EnableAutoConfiguration
public class ThirdTermTwoController implements ThirdTermTwoInterface {

	protected String message = "親での初期値。";
	
	//spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermTwoController.class, args);
    }

    
	@RequestMapping("/")
    @ResponseBody
    String home() {

		//この章ではクラスの作成のほか、修飾子、継承、抽象、インターフェース、匿名、を勉強します
		
		//3-2-1 3-2-2 3-2-3 3-2-4
		makeUserInfoClass();
		
		//3-2-5
		//継承
		//子クラスから親クラスの「superFunc()」を呼び出す
		
		//3-2-6
		//抽象クラス
		//後日詳しく
		
		//3-2-7
		//インターフェース
		System.out.println("インターフェースの定数は" + INTERFACE_MESSAGE);
		
		message = "親から呼んでます。";
		say(message);
		
		return "ThirdTermTwoController";
    }


	

	
	public void makeUserInfoClass() {

		//ユーザーインフォに情報を渡してインスタンス化します。
		//UserInfoクラスはは外部ファイルで

		//両方
		UserInfo sugiyama1 = new UserInfo("杉山",Integer.valueOf(37));
		System.out.println("name1 = " + sugiyama1.name + " age1 = " + sugiyama1.age);

		//名前だけ渡す場合
		UserInfo sugiyama2 = new UserInfo("杉山");
		System.out.println("nam2 = " + sugiyama2.getName() + " age2 = " + sugiyama2.getAge());
		
		//年だけ渡す場合
		UserInfo sugiyama3 = new UserInfo(37);
		System.out.println("name3 = " + sugiyama3.getName() + " age3 = " + sugiyama3.getAge());

		//空でもいいよ
		UserInfo sugiyama4 = new UserInfo();
		System.out.println("name4 = " + sugiyama4.getName() + " age4 = " + sugiyama4.getAge());
		
	}
	
	

	@Override
	public String say(String message) {

		System.out.println(message);
		return message;
	}
	

	
	
	


}
