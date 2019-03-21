package exercise_06;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Child extends Parent {
	private String name;

	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	
}
