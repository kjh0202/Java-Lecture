package sec03;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("--------------------------------------------------");
				System.out.println("1.증속 | 2. 감속 | 3. 중지 | 4.급가속 | 5. 급감속");
				System.out.println("--------------------------------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
		
			if (keyCode == 49) {  // 49='1'
				speed++;
				
			} else if (keyCode == 50) { 
				speed--;
				if (speed < 0)	//속도가 음수가 되지 않게
					speed = 0;
				
			} else if (keyCode == 51) {
				run = false;
				
			} else if(keyCode == 52) {	
				speed += 10;
				
			} else if(keyCode == 53) {	
				speed -= 10;
				if (speed < 0)
					speed = 0;
				
			}
			System.out.println("현재 속도=" + speed);
		}
		
		System.out.println("프로그램 종료");

	}

}
