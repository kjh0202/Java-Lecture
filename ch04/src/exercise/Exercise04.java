package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			int sum = num1 + num2;
			if(sum == 5) {
				System.out.println("주사위의 합이 5이므로 실행을 종료합니다.");
				System.exit(0);
			}
			
		}
		
	}
}	