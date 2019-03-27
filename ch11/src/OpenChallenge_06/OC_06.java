package OpenChallenge_06;

public class OC_06 {
	 public static void main(String[] args) {
	        // TODO 자동 생성된 메소드 스텁

        int MaxPalindrome = 0;
        int chk;


        System.out.println("-----------------");

        for (int i = 100; i < 1000; i++) {

            for (int j = 100; j < 1000; j++) {
                chk = i * j;

                if (chkPalindrome(chk)) {
                    MaxPalindrome = compareMax(MaxPalindrome, chk);
                } else {
                }
            }
        }
        System.out.println("세자리 수끼리 곱하여 계산된 최대 대칭수는" + MaxPalindrome + " 입니다.");
    }

    public static boolean chkPalindrome(int a) {
        String str = Integer.toString(a);

        int rvs = Integer.parseInt(reverseString(str));

        if (a == rvs) {
            return true;
        } else {
            return false;
        }
    }

    public static int compareMax(int max, int comp) {
        System.out.println("현재 최대값 : " + max);
        System.out.println("비교할 값 : " + comp);

        if (max < comp) {
            System.out.println("현재 최대값보다 비교값이 커서, 최대값이 " + comp + " 로 교체되었습니다.");
            return comp;
        } else {
            System.out.println("현재 최대값보다 비교값이 같거나 작아, 최대값이 교체되지 않았습니다.");
            return max;
        }
    }

    public static String reverseString(String s) {
        return (new StringBuffer(s)).reverse().toString();
    }

}

//최대대칭수 : 906609 = 993 x 913