package ex_StudentScore;

import java.util.Scanner;

public class StudentScoreExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========성적표========");
		
		System.out.print("성명 : ");
		String name = scan.nextLine();
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(scan.nextLine());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(scan.nextLine());
		
		System.out.print("과학 : ");
		int sci = Integer.parseInt(scan.nextLine());
		
		StudentScore studentScore = new StudentScore(name, math, eng, sci);
		double avg = studentScore.average();	//부름(타입은 쓰지x, 변수만)
		System.out.printf("평균: %.2f\n", avg);
		//String.format("%.2f",avg)
		System.out.println(studentScore.toString());

		scan.close();
	}

}



/*5. 이름과 수학, 영어, 과학 성적을 입력으로 받아서 

이름과 수학, 영어, 과학, 평균을 출력하는 프로그램을 작성하시오.*/