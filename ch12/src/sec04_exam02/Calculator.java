package sec04_exam02;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
		
/*	public synchronized void setMemory(int memory) { //synchronized만 추가
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}*/
	
	public void setMemory(int memory) { //위와 같은 결과
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {
		this.memory = memory;
		//System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
