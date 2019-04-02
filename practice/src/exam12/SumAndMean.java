package exam12;

public class SumAndMean {

	public static void main(String[] args) {
		int[][] intArray = {
				{95, 86, 88},
				{88, 92, 96, 85},
				{78, 83, 93, 87, 88}
		};		
		
		int sum = 0;
		double avg = 0.0;
		int count=0;
		
		for ( int i = 0 ; i <intArray.length; i++){	//합
			for (int k = 0; k < intArray[i].length; k++){	
				sum += intArray[i][k];	
				count++;	
			}	
		}
		avg = (double)sum/count;	//평균	
		System.out.println("배열의 전체 항목의 합: " + sum);
		System.out.println("평균값: " + avg);
	}
}