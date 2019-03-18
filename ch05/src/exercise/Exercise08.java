package exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int max, min;
		max = min = array[0][0];
		int cnt = 0;

		for ( int i = 0 ; i <array.length; i++){	//합
			for (int k = 0; k < array[i].length; k++){	
				sum += array[i][k];	
				cnt++;	
				if(array[i][k] > max) max = array[i][k];		//최대값, 최소값     
				if(array[i][k] < min) min = array[i][k];
			}	
		}
		avg = (double)sum/cnt;	//평균		
		
		double var = 0.0;		//분산
		for(int i=0; i<array.length; i++){	
			for(int k=0; k<array[i].length; k++){					
				var += (array[i][k] - avg) * (array[i][k] - avg);
			}
		}
	
		var /= cnt;
			
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("var: " + var);
	}

}
