package com.chapter6_2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class ExceptionController<E> {

	 public static void main(String[] args) throws IOException {
	    	
		 //6-2　例外でつまづかないための基本
		 
		 //6-2-1
		 //エラーコードをreturnしない
		 //
		 firstAction();
		 
		 //6-2-2
		 /*
		  * 例外をもみ消さない
		  * ・ログ出力を忘れない
		  * ・処理を継続するか判断する
		  * 
		  */
		 
		 //6-2-3
		 //throws exception感染
		 /*
		  * どこでもかしこでも例外をスローすると、地獄に陥る
		  * コードが多くなれば、例外の発生の原因の特定が難しくなるとも
		  * 
		  */
		 
		 
		 //6-2-4
		 //どの階層で例外を補足して処理するべきか
		 /*
		  * ・例外が発生する（可能性がある）場所　=　末端処理部分で例外を発生させるだけにしておくのがいい
		  * ・処理の流れを判断する場所　=　エラーによっては分岐させる必要がある箇所
		  * 
		  */

		 
		 //6-2-5
		 //独自例外処理
		 /*
		  * 基本的には、java標準の例外を使用する
		  * 独自例外を処理する場合は、統一的に処理したい場合。
		  * よくつくるのは
		  * ・アプリケーション例外
		  * ・システム例外
		  * 
		  */
		 
		 //6-2-6
		 //例外のトレンド
		 /*
		  * ・検査例外（）よりも実行例外を使う
		  * ・ラムダ式の中で発生した例外の扱い　ラムダの中での例外は、ラムダの中で処理するほうがいいい
		  * 
		  * 
		  * 
		  * 例
		   try{
			   //ラムダ処理
		   }
		   catch(IOException ioex) {
			   //ログを出力してスローする
			   //throw new UncheckedException(ioex);
		   }
		
		  * 
		  * ・Optionalクラス
		  */
		 sixAction();

			   
		 
		
    }
	

	
    







	public static void firstAction() throws IOException {
		File file = new File("C:\\Developer\\Introduction\\src\\main\\java\\com\\chapter6\\Exception.txt");
		
		System.out.println("Value = " + getValueFromFile(file));
	}

	public static String getValueFromFile(File file) throws IOException {

		String pathString = file.getPath();
		Path path = Paths.get(pathString);
		Properties props = new Properties();
		props.load(Files.newInputStream(path));
		
		String value = props.toString();
		return value;
	}

	
	

	
	private static void sixAction() {
		// TODO Auto-generated method stub
		
	}
	

	


}







