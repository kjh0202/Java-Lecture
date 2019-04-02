package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scan.nextLine());
			
			switch(num) {
			case 1:
				System.out.print("예금액> ");
					int plus = Integer.parseInt(scan.nextLine());
					balance += plus;
				/*try {
					balance = Integer.parseInt(scan.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("금액을 올바르게 입력하세요");
				}*/
				
				break;
			case 2:
				System.out.print("출금액> ");
				int minus = Integer.parseInt(scan.nextLine());
				if(balance < minus) {
					System.out.println("잔액이 부족합니다. 현재 잔액 " + balance);
				}
				balance -= minus;
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				break;
			}
			System.out.println();	
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

}
