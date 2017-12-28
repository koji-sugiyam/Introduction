package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;



@Controller
@EnableAutoConfiguration
public class ThirdTermOneController {

	//spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermOneController.class, args);
    }

    
	@RequestMapping("/")
    @ResponseBody
    String home() {
	
		//1-1 //1-2 
		primitive();

		//1-3
		reference();
		
		//1-4
		wrapper();
		
		//1-4
		wrappeMethod();
		
		//1-5
		autoboxingUnboxing();
		
		//1-5 比較
		compare();
		
		//総括
		//基本的にはラッパーでプログラムを組んで、計算する場合に都度プリミティブ型に入れて（変換して）計算するようにする

		return "ThirdTermOneController";
    }
	
	
	
	public static void primitive() {
		

		//宣言
		boolean boolA = true;
		
		//プリミティブ
		int num1 = 123;
		System.out.println("10進数 = " + num1);

		int num2 = 010;
		System.out.println("8進数 = " + num2);

		int num3 = 0xa;
		System.out.println("16進数 = " + num3);

		int num4 = 0b11;
		System.out.println("2進数 = " + num4);

		long longNum = 1L;
		System.out.println("long = " + longNum);

		float floatNum = 3.14f;
		System.out.println("float = " + floatNum);

		float floatNum2 = 3f;
		System.out.println("float = " + floatNum2);

		double doubleNum = 3.154;
		System.out.println("double = " + doubleNum);

		double doubleNum2 = 3d;
		System.out.println("double = " + doubleNum2);

		boolean bool = true;
		System.out.println("bool = " + bool);
		
		char c ='A';
		System.out.println("char = " + c);
		
		long amount = 123_456_789L;
		System.out.println("amount = " + amount);
		
		
		//ワイドニングとナローイング
		
		//ワイドニングで自動変換
		short shortNumWide = 100;
		int intNumWide = shortNumWide; 
		System.out.println("ワイドニング = " + intNumWide);

		//ナローイング
		int intNumNarrow = 32767 + 1;
		short shortNumNarrow = (short)intNumNarrow; //intをshortにキャスト 
		System.out.println("ナローイング = " + shortNumNarrow);
		
		
	}
	
	public static void reference() {
		
		//参照型
		String firstName = new String("杉山");
		System.out.println("firstName = " + firstName);
		System.out.println("firstName.length = " + firstName.length());
		
		firstName = "杉山"; //省略形でもいい 
		System.out.println("firstName = " + firstName);
		System.out.println("firstName.length = " + firstName.length());
		
		
		String nullStr = null;
		if(nullStr != null) {
			System.out.println("nullStr.length = " + nullStr.length());
		}
		else {
			System.out.println("nullStr.length = null");
		}
		
		
	}
		
		
	
	public static void wrapper() {
		
		//ラッパークラス
		//テキスト参照
		
		//定数
		System.out.println(
				"Byte = " + 
				"SIZE(bit) = " + Byte.SIZE + " " + 
				"Bytes = " + Byte.BYTES + " " + 
				"MIN = " + Byte.MIN_VALUE + " " + 
				"MAX = " + Byte.MAX_VALUE + " " 
				);

		System.out.println(
				"Integer = " + 
				"SIZE(bit) = " + Integer.SIZE + " " + 
				"Bytes = " + Integer.BYTES + " " + 
				"MIN = " + Integer.MIN_VALUE + " " + 
				"MAX = " + Integer.MAX_VALUE + " " 
				);

		System.out.println(
				"Long = " + 
				"SIZE(bit) = " + Long.SIZE + " " + 
				"Bytes = " + Long.BYTES + " " + 
				"MIN = " + Long.MIN_VALUE + " " + 
				"MAX = " + Long.MAX_VALUE + " " 
				);

		System.out.println(
				"Double = " + 
				"SIZE(bit) = " + Double.SIZE + " " + 
				"Bytes = " + Double.BYTES + " " + 
				"MIN = " + Double.MIN_VALUE + " " + 
				"MAX = " + Double.MAX_VALUE + " " 
				);

		System.out.println(
				"Float = " + 
				"SIZE(bit) = " + Float.SIZE + " " + 
				"Bytes = " + Float.BYTES + " " + 
				"MIN = " + Float.MIN_VALUE + " " + 
				"MAX = " + Float.MAX_VALUE + " " 
				);
	}
	
	
	public static void wrappeMethod() {
		
		//int - Integer
		Integer num1 = new Integer(10);//新しくインスタンスを生成する
		Integer num2 = Integer.valueOf(10);//キャッシュを使うので早い

		//Integer - int
		Integer num3 = num2.intValue();//新しくインスタンスを生成する
		
		//String - Integer
		int num4 = new Integer("10");
		Integer num5 = Integer.valueOf("10");//キャッシュを使うので早い
		System.out.println(num5);
		Integer num6 = Integer.valueOf("10",2);//基数指定　これは2進数　結果は10進数の10
		System.out.println(num6);
		Integer num7 = Integer.valueOf("10",8);//基数指定　これは8進数　結果は10進数の8
		System.out.println(num7);
		Integer num8 = Integer.valueOf("10",16);//基数指定　これは8進数　結果は10進数の16
		System.out.println(num8);
		
		//int - String
		String num9 = Integer.toString(10);
		System.out.println(num9);
		
		//Integer - String
		String num10 = num1.toString();
		System.out.println(num10);
		
		
	}
    
	
	public static void autoboxingUnboxing() {

		//プリミティブからラッパークラスに自動変換
		//オートボクシング　
		int num = 10;
		Integer numInt = 10; // 実際にはInteger.valueOf(10)が実行される　//オートボクシング
		System.out.println(numInt);
		
		//アンボクシング
		int sum = num + numInt; //実際にはnum + numInt.intValue())される //アンボクシング
		System.out.println(sum);

		//アンボクシング & //オートボクシング
		Integer sumInteger = num + numInt; //実際には、Integer.valueOf(num + numInt.intValue())される //アンボクシングされてオートボクシングされる　
		System.out.println(sumInteger);
	}
	
	public static void compare() {
		
		//オートボクシングされるので同じ
		Integer num1 = 127;
		Integer num2 = Integer.valueOf(127);
		System.out.println(num1 == num2);
		System.out.println(num1.getClass());
		System.out.println(num2.getClass());

		//型の範囲を超えた数値はオートボクシングされると型判定がfalseになる
		Integer num11 = 128;
		Integer num22 = Integer.valueOf(128);
		System.out.println(num11 == num22);
		System.out.println(num11.getClass());
		System.out.println(num22.getClass());
		
		
	}
	
	

    
}






