package OpenChallenge_02;

public class MyMultiImpl implements MyMulti {
	@Override
	public int sum(int[] x) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

	@Override
	public double avg(int[] x) {
		double avg = (double)sum(x) / x.length;
		return avg;
	}

	@Override
	public int max(int[] x) {
		int maxItem = x[0];

	    for (int i = 1; i < x.length; i++)
	      if (x[i] > maxItem) maxItem = x[i];

	    return maxItem;
	}

	@Override
	public int min(int[] x) {
		 int min = x[0];

		 for (int item : x)
			 if (min > item) min = item;

		 return min;
	}
	
}
