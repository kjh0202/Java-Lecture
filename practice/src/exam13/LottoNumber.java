package exam13;

import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}
	
	static int[] getLottoNumber() {
		
		int[] intArray = new int[45];
			for(int i=0; i<intArray.length; i++)
				intArray[i] = i+1;
			
		int temp = 0;
		int k = 0;
			for(int i=0; i<100; i++) {
			k = (int)(Math.random() * 45);
				temp = intArray[0];
				intArray[0] = intArray[k];
				intArray[k] = temp;
			}
			for(int i=0; i<6; i++)
			System.out.println(intArray[i]+i);
	
			return intArray;


		
	}
}


