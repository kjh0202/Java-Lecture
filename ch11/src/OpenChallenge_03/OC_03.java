package OpenChallenge_03;

import java.util.Scanner;

public class OC_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("수 입력 : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=1; j<i; j++) {
                if(i%j==0) {
                    sum += j;
                }
            }
            if(i==sum) {
                System.out.println(i);
            }
        }

    }
}


	/*최초 네 개의 완전수는 6, 28, 496, 8128이다.
	
	6 = 1 + 2 + 3
	28 = 1 + 2 + 4 + 7 + 14
	496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
	8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064*/