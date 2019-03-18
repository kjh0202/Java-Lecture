package sec06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
				
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);	//System.arraycopy()로 배열 복사
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if ( i != newStrArray.length-1 ) //마지막 null다음의 콤마(,) 안보이기
				System.out.print(",");
		}
		System.out.println();
		
		String[] utilStrArray = Arrays.copyOf(oldStrArray, 5);	//copyOf
		System.out.print(Arrays.toString(utilStrArray));
	}

}
