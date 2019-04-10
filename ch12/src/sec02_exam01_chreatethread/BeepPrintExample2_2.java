package sec02_exam01_chreatethread;

import java.awt.Toolkit;

public class BeepPrintExample2_2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { //익명구현객체
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
	}
}

