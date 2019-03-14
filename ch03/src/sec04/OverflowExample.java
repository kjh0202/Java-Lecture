package sec04;

public class OverflowExample {

	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;		// 1000000*1000000은 int 타입에 저장될 수 있는 값의 범위를 초과함
		System.out.println(z);
		*/
		
		long lx = 1000000;
		int y = 1000000;
		long lz = lx * y;		
		System.out.println(lz);
	
	}

}
