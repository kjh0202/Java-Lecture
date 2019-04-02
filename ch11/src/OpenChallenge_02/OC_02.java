package OpenChallenge_02;

import java.util.Scanner;

public class OC_02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String str = scan.nextLine();
		
		System.out.println("전: " + str);
		System.out.println("후: " + dashInsert(str));
		scan.close();
	}
	
	static String dashInsert(String str) {
		StringBuilder sb = new StringBuilder();
		boolean odd = false;	// previous number가 홀수인지 여부
		boolean even = false;	// previous number가 짝수인지 여부
		for(int i=0; i<str.length(); i++) {
			if (Integer.valueOf(str.charAt(i)) % 2 == 0) {
				if (even)
					sb.append('*');
				even = true; odd = false;
			} else {
				if (odd)
					sb.append('-');
				odd = true; even = false;
			}
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
	
	

	
	
/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자를 입력하세요 : ");
	String num = sc.nextLine();

	char[] ch = num.toCharArray();
	String result = "";

	for(int i = 0; i < ch.length-1; i++){
		if( ch[i]%2 == 1 && ch[i+1]%2 == 1 ){
			result += ch[i] + "-";
		} else if (ch[i]%2 == 0 && ch[i+1]%2 == 0){
			result += ch[i] + "*";
		} else {
			result += ch[i];
		}
	}
	result += ch[ch.length-1];

	System.out.println("출력결과 " + result);
}
}*/


