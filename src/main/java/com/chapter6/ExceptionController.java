package com.chapter6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionController {

	 public void main(String[] args) throws IOException {
	    	
		//6-1-1
		//例外の３つの種類
		/*
		 * 検査例外 : Exception : ファイルの読み書き
		 * 実行時例外 : RuntimeException : 
		 * エラー : Error : 致命的なエラー :　プログラムで補足するべきでないもの
		 * 
		 */
			
		//6-1-2
		//例外を表す３つのクラス
		/*
		 * 1)java.lang.Exception : 検査例外を表すクラス
		 * ・ファイルやネットワークなどの入出力エラー : java.io.IOException
		 * ・データベースアクセス中のエラー : java.sql.SQLException
		 * 
		 * 2)java.lang.RuntimeException : 実行時例外を表すクラス
		 * 
		 * 3)java.lang.Errorクラス : 重大な問題
		 * このエラーは、例外で補足すべきではない。なぜなら、異常が起こっている状態のため、プログラムを終了するべきだから。
		 */
			
		//6-1-3 例外処理の３つの構文
		// 1) try～catch～finaly (java6までの書き方)
		firstAction();

		// 2) try～with～resources (java7からの書き方)
		secondAction();
		
    }
	

	
    

	
	public void firstAction() throws IOException {
			
		byte[] contents = new byte[100];
		InputStream is = null;
		Path path = Paths.get("Exception.txt");
		try {
			//例外が発生するコードを含む処理
			is = Files.newInputStream(path);
			is.read(contents);
		}
		catch (IOException e){
			//例外をキャッチした際に書く処理
			
		}
		finally{
			//try～catch ブロックを終了する場合に必ず実行する処理を書く
			if(is != null) {
				is.close();
			}
		}
		System.out.println("Value = " + new String(contents, StandardCharsets.UTF_8));
		
		
		
		//この場合は、「is.read」で例外が発生してしまうと、メモリリークが発生する可能性
		try {
			//例外が発生するコードを含む処理
			is = Files.newInputStream(path);
			is.read(contents);
			is.close();
		}
		catch (IOException e){
			//例外をキャッチした際に書く処理
			
		}
		
		
		
		//finalyでリソースを開放しましょう
		try {
			//例外が発生するコードを含む処理
			is = Files.newInputStream(path);
			is.read(contents);
		}
		catch (IOException e){
			//例外をキャッチした際に書く処理
			
		}
		finally{
			//try～catch ブロックを終了する場合に必ず実行する処理を書く
			if(is != null) {
				try {
					is.close();
				}
				catch (IOException e){
					
				}
				finally {
					
				}
			}
		}
		System.out.println("Value = " + new String(contents, StandardCharsets.UTF_8));
		
	}


		
	public void secondAction() throws IOException {

		byte[] contents = new byte[100];
		Path path = Paths.get("Exception.txt");
		
		//java7以降では
		//(2)try～with～resource
		try (InputStream is = Files.newInputStream(path)){
			is.read(contents);
		}
		catch(IOException e) {
			
		}
		
	}
	
		


}




