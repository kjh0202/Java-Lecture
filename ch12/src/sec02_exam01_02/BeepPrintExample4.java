package sec02_exam01_02;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new Thread() { //익명
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
	}
}
