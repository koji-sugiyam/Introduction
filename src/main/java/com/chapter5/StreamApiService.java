package com.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import com.chapter5.Student;

public class StreamApiService extends StreamApiAbstract implements StreamApiInterface {

	//使用するStudentクラスはimportしておく
	/*
	 * 同一パッケージ内にクラスファイルが存在する場合は記述しなくてもいいが、記述しておいたほうが間違いない。
	 */
	
	protected ArrayList<Student> studentList;
	protected ArrayList<String> resultArray;
	protected String response;
	
	//コンストラクタ
	public StreamApiService() {

		//初期化しておく
		this.resultArray = new ArrayList<>();
		this.response = "";
	}
	
	//実行
	public String streamApiRun() {

		
		//抽出処理
		studentList = new ArrayList<>();
		studentList.add(new Student("清水",100));
		studentList.add(new Student("飯沼",80));
		studentList.add(new Student("和田",50));
		studentList.add(new Student("中井",20));
		studentList.add(new Student("杉山",70));
		studentList.add(new Student("川上",40));
		studentList.add(new Student("浜田",60));
		studentList.add(new Student("長森",30));
		
		//出力　まとめて1行
		System.out.println(studentList);
		System.out.println("--");
		//1行づつ
		studentList.forEach(student -> System.out.println(student));
		System.out.println("--");
		//メソッド参照で出力してみる 上と同じ
		studentList.forEach(System.out::println);
		System.out.println("--");
		
		//ソート
		sort(studentList);
		
		//抽出
		extract(studentList);
			
		//結果
		return getResponse();
	}
	
	
	
	
	private void sort(ArrayList<Student> studentList) {
		
		//ソート　旧記法
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student student1,Student student2) {
				//scoreで昇順
				return Integer.compare(student1.getScore(),student2.getScore());
				//scoreで降順
				//return Integer.compare(student2.getScore(),student1.getScore());
			}
		});
		//ソート　ラムダ式
		Collections.sort(
			studentList,
			//降順
			//(Student student1, Student student2) -> Integer.compare(student2.getScore(),student1.getScore()) 
			//ラムダ式は引数の型を省略できる
			(student1, student2) -> Integer.compare(student2.getScore(),student1.getScore())
		);
		//ソート　ラムダ式　ブロックでも書ける
		Collections.sort(
			studentList,
			(student1, student2) -> {
				int score1 = student1.getScore();
				int score2 = student2.getScore();
				//昇順
				//return Integer.compare(score1,score2);
				//降順
				return Integer.compare(score2,score1);
			}
		);
	}
	

	private void extract(ArrayList<Student> studentList) {
		//70-50点の人を抽出してListに入れる
		
		//ストリームを変数で作成してから実行
		Stream<Student> stream = studentList.stream();
			stream
			//70-50点の人を抽出
			.filter(student -> student.getScore() <= 70 && student.getScore() >= 50) 
			//名前をresultArrayに加える
			.forEach(student ->addResult(student.getName(),student.getScore())  
		);
		//通常はこっちのほうがベター
		studentList.stream()
			//70-50点の人を抽出
			.filter(student -> student.getScore() <= 70 && student.getScore() >= 50) 
			//名前をresultArrayに加える
			.forEach(student -> addResult(student.getName(),student.getScore()) 
		);
			
		
	}
	
	
	private void addResult(String name,Integer score) {
	
		this.resultArray.add(String.format("%sさん : %d点", name, score));
	}
	
	
	
	
	private String getResponse() {
		
		return String.format(
				"%s <br> %s", 
				StreamApiInterface.CONTROLLER_NAME, 
				this.resultArray.toString()
				);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}