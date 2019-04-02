package exam15;

public class palindrome {
	public static void main(String[] args) {
		int max = 0;
		int a = 0, b = 0;
		for (int i=100; i<=999; i++) {
			for (int k=100; k<=999; k++) {
				if (isPalindrome(i*k)) {
					if (max < i*k) {
						a = i; b = k; max = i*k;
					}
				}
				if( a > b ) {
					max = i;
				} max = k;
			}
		}
		System.out.println("세자리 수를 곱해 만들 수 있는 대칭수 중에서 가장 큰 수는? " + max);
	}

	static boolean isPalindrome(int number) {
		String str = String.valueOf(number);
		int len = str.length();
		for (int i=0; i<len/2; i++) {
			if (str.charAt(i) != str.charAt(len-1-i))
				return false;
		}
		return true;
	}
}
