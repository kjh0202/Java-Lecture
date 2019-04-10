package sec04_exam01_unsynchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
		
	public void setMemory(int memory) {
		this.memory = memory;
		//System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
