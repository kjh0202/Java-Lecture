package sec05_exam01_Textends;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (x) //
		//public static <T extends Number> int compare(T t1, T t2) 
		//숫자만 가능
		
		int result1 = Util.compare(10, 20); //compare 왼쪽값이 작으면 -1, 크면 1, 같으면 0
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
		
		int result3 = Util.compare(5.5, 5.5);
		System.out.println(result3);
	}
}
