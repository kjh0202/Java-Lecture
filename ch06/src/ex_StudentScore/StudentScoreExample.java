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
		double avg = studentScore.average();
		System.out.printf("평균: %.2f\n", avg);
		System.out.println(studentScore.toString());

		scan.close();
	}

}
