package sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;					//'L'을 붙이는 게 원칙
		long var2 = 20L;
		//long var3 = 1000000000000;	//컴파일 에러(int 타입의 저장 범위를 넘어서는 큰 정수는 'L'을 붙여야 한다)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
