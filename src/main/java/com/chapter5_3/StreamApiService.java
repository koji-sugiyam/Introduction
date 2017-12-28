package com.chapter5_3;

import java.util.*;
import java.util.stream.Stream;

import com.chapter5.Student;
import com.chapter5_3.Group;

public class StreamApiService extends StreamApiAbstract implements StreamApiInterface {
	
	private List<Student> students;
	
	//コンストラクタ
	public StreamApiService() {
		
		students = new ArrayList<>();

		students.add(new Student("杉山",100));
		students.add(new Student("杉山",90));
		students.add(new Student("佐藤",80));
		students.add(new Student("田中",60));
		students.add(new Student("飯沼",50));
		students.add(new Student("清水",40));
		students.add(new Student("高田",30));
		students.add(new Student("和田",20));
		students.add(new Student("川上",10));
		students.add(new Student("杉山",100));
		students.add(new Student("杉山",90));
		students.add(new Student("佐藤",80));
		students.add(new Student("田中",60));
		students.add(new Student("飯沼",50));
		students.add(new Student("清水",40));
		students.add(new Student("高田",30));
		students.add(new Student("和田",20));
		students.add(new Student("川上",10));
	}
	
	//実行
	public void replaceMapStream() {

		//scoreの取得
		Stream<Student> studentStream1 = students.stream();
		Stream<Integer> scoreStream = studentStream1.map(Student::getScore);
		scoreStream.forEach(score->
				System.out.println(
						String.format("%s",score)
						)
				);
		//現実的なのは
		students.stream()
			.map(v->v.getScore())
			.forEach(score->
				System.out.println(
					String.format("score = %s",score)
					)
			);
		
		//nameの取得
		Stream<Student>studentStream2 = students.stream();
		Stream<String> nameStream = studentStream2.map(Student::getName);
		nameStream.forEach(name->
				System.out.println(
						String.format("%s",name)
						)
				);
		//現実的なのは
		students.stream()
			.map(v->v.getName())
			.forEach(name->
				System.out.println(
						String.format("%s",name)
						)
				);
		
		//例えばscoreを「inｔ型」で「5点減算」処理して出力する場合は
		students.stream()
			.mapToInt(v->v.getScore())
			.forEach(scoreInt-> {
				int adjustScore = scoreInt - 5;			
				System.out.println( String.format("score = %d",adjustScore) );
				}
			);
		
	}
	
	
	
	
	
	
	public void mergeMapStream() {
			
		List<Group> groups = new ArrayList<>();
		
		Group studentGroup1 = new Group();
		studentGroup1.add(new Student("杉山",100));
		studentGroup1.add(new Student("佐藤",80));
		studentGroup1.add(new Student("田中",60));
		System.out.println(studentGroup1);
		groups.add(studentGroup1);
		
		Group studentGroup2 = new Group();
		studentGroup2.add(new Student("飯沼",50));
		studentGroup2.add(new Student("清水",40));
		studentGroup2.add(new Student("高田",30));
		System.out.println(studentGroup2);
		groups.add(studentGroup2);

		Group studentGroup3 = new Group();
		studentGroup3.add(new Student("和田",20));
		studentGroup3.add(new Student("川上",10));
		System.out.println(studentGroup3);
		groups.add(studentGroup3);
		
		System.out.println(groups);
		
		groups.stream()
			.flatMap(g->g.getStudents().stream() )
			.sorted((s1,s2) -> s1.getScore() - s2.getScore() )
			.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()) );
			
			
	}
	
	
	
	public void filterMapStream() {
		
		//filterで７０点以上を抽出
		System.out.println("filterで７０点以上を抽出---");
		students.stream()
			.filter(v-> v.getScore() > 70 )
			.forEach(v->
				System.out.println(
					String.format("%s %s",v.getName(),v.getScore())
					)
				);
		
		//filterで"田"を含む抽出
		System.out.println("filterで「田」を含む抽出---");
		students.stream()
			.filter(v-> v.getName().matches(".*田.*"))
			.forEach(v->
				System.out.println(
					String.format("%s %s",v.getName(),v.getScore())
					)
				);
		
		//limitで３個
		System.out.println("limitで３個---");
		students.stream()
			.limit(3)
			.forEach(v->
				System.out.println(
					String.format("%s %s",v.getName(),v.getScore())
					)
				);
		
		//distinctでユニークなものだけ
		System.out.println("distinctでユニークなものだけ---");
		students.stream()
			.distinct()
			.forEach(v->
				System.out.println(
					String.format("%s %s",v.getName(),v.getScore())
					)
				);
		

		
		//ユニークな7０点以上を３つ
		System.out.println("ユニークな4０点以上を昇順で３個---");
		students.stream()
			.distinct()
			.filter(v-> v.getScore() >= 40 )
			.sorted((s1,s2) -> s1.getScore() - s2.getScore() )//昇順にする
			.limit(3)
			.forEach(v-> {
				System.out.println(
					String.format("%s %s",v.getName(),v.getScore())
					);
				}
			);	
	}

	
}