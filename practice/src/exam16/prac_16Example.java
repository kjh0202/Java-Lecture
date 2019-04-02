package exam16;

import java.util.Scanner;

public class prac_16Example {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요(-포함 7자리만) : ");
		int jumin = Integer.parseInt(scan.nextLine());
		
		System.out.println(jumin);
		
		
		
		switch(jumin) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		}
	}
	
}
