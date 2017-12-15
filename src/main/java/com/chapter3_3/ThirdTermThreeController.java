package com.chapter3_3;

import java.util.Objects;
import java.lang.*;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter3_3.BaseService;



@Controller
@EnableAutoConfiguration
public class ThirdTermThreeController {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermThreeController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		//3-3-1
		//オブジェクトの比較
		objectInstanceOf();
		
		//3-3-2
		//オブジェクトの等価性
		objectEquals();
		objectHashCode();
		
		//3-3-2
		//hashCode()の独自Overrideは割愛
		
		//3-3-2
		//StringBuilderも割愛
		//stringフォーマットでいいじゃん？
		stringFormat();
		
		return "ThirdTermThreeController";

    }


	public void objectInstanceOf() {
		Object obj = new BaseService("Hello");
		
		System.out.print((obj instanceof BaseService) + "\r\n"); //importしてBaseServicでインスタンス化しているので　true
		System.out.print((obj instanceof BaseServiceAbstract) + "\r\n"); //BaseService　が　BaseServiceAbstract　を継承しているので true
		System.out.print((obj instanceof BaseServiceInterface) + "\r\n"); //BaseServiceAbstract　が　BaseServiceInterfaceをimplements　しているので true
		System.out.print((obj instanceof Integer) + "\r\n"); //obj は Integerではないので false
		
		//ちなみに
		BaseService instance = new BaseService("Hello");
		System.out.print((instance.name instanceof String) + "\r\n"); //インスタンス変数の name は String型 なので true
		System.out.print("---" + "\r\n");
	}
	
	public void objectEquals() {

		Object obj1 = new BaseService("Hello");
		Object obj2 = new BaseService("Hello");
		System.out.print( obj1.equals(obj2) + "\r\n" ); //オブジェクト違いなので　false

		//ちなみに
		BaseService instance1 = new BaseService("Hello");
		BaseService instance2 = new BaseService("Hello");
		System.out.print( instance1.equals(instance2) + "\r\n" ); //インスタンスが違うので false
		System.out.print( instance1.name.equals(instance2.name) + "\r\n" ); //インスタンス変数の値が同じなので true
		System.out.print("---" + "\r\n");
	}
	
	public void objectHashCode() {
		
		Object obj1 = new BaseService("Hello");
		Object obj2 = new BaseService("Hello");
		System.out.print( obj1.hashCode() + "\r\n" ); //ハッシュコードはそれぞれ違う
		System.out.print( obj2.hashCode() + "\r\n" ); //ハッシュコードはそれぞれ違う
		System.out.print("---" + "\r\n");
	}
	
	public void stringFormat() {
		
		String format = ("文字：%s 数字：%d　桁そろえ数字%03d \r\n");
		System.out.print( String.format(format,"aaa",111,2) );
		System.out.print("---" + "\r\n");
	}
}






