package sec02;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//값을 직접 입력받음
		System.out.print("점수를 입력하세요> ");
		//int score = scan.nextInt();//이게 맞지만 여러번 돌리면 안됨
		//String line = scan.nextLine();
		//int number = Integer.parseInt(line);
		//int score = Integer.parseInt(line);
		int score = Integer.parseInt(scan.nextLine());
		
		if(score >= 90) {
			System.out.println("점수가 90~100 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		scan.close();
	}

}
