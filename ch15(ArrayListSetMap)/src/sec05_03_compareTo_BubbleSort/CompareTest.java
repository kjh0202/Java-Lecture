package sec05_03_compareTo_BubbleSort;

import java.util.Arrays;

public class CompareTest {
/*	public static void main(String[] args) {
		String[] names = { "김씨", "이씨", "한씨", "박씨", "정씨" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}*/
	
	
	public static void main(String[] args) {		//bubbleSort
		String[] names = { "김씨", "이씨", "한씨", "박씨", "정씨" };
		bubbleSort(names);
		System.out.println(Arrays.toString(names));
	}
	static void bubbleSort(String[] names) {
		int len = names.length;
		for (int i=0; i<len-1; i++) {
			for (int k=i+1; k<len; k++) {
				// names[i] 와 names[k]를 비교하여 조건에 맞으면 swap
			}
		}
	}
}
