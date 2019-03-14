package sec03;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	// 모든 int값을 실수 타입으로 안전하게 변환시키는 double 타입을 사용
		num2 = (int) num3;
		
		System.out.println(num1 + ", " + num2);
		int result = num1 - num2;
		System.out.println(result);

	}

}
