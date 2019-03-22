package OpenChallenge_02;

import java.lang.reflect.Array;

public class MyMultiApp {
	public static void main(String[] args) {
		MyMultiImpl myMultiImpl = new MyMultiImpl();
		int[] intArray = {12, 34, 23, 89, 5};
		
		int maxresult = myMultiImpl.max(intArray);
		System.out.println("최대값: " + maxresult);
		int minresult = myMultiImpl.min(intArray);
		System.out.println("최소값: " + minresult);
		int sumresult = myMultiImpl.sum(intArray);
		System.out.println("합계: " + sumresult);
		double avgresult = myMultiImpl.avg(intArray);
		System.out.println("평균: " + avgresult);
	}
	
}
