package sec03_03;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionlInterfaceIntx fi;
		
		fi= (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}
