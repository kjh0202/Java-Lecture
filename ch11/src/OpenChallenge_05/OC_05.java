package OpenChallenge_05;
import java.util.Scanner;

public class OC_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열과 숫자 입력: ");
		String str = scan.nextLine();
		String[] tmp = str.split(" ");
		int number = Integer.parseInt(tmp[1]);
		str = makeCaesarEncryption(tmp[0], number);
		System.out.println(str);
		scan.close();
	}
	
	static String makeCaesarEncryption(String str, int number) {
		byte[] plain = str.getBytes();
		byte[] crypt = new byte[str.length()];
		for (int i=0; i<str.length(); i++) {
			if (plain[i] + number <= 90) 	// 'Z' = 90
				crypt[i] = (byte)(plain[i] + number);
			else
				crypt[i] = (byte)(plain[i] + number - 26);
		}
		return new String(crypt);
	}
	
}	
	
	



/*    public static void main(String[] args) {
        String A="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans="";
        int adress;

        Scanner s= new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String word=s.nextLine();
        System.out.print("n을 입력 :");
        int n=s.nextInt();
                    n=n%26;      // 한바퀴 돌 경우 대비

        for(int i=0;i<word.length();i++) {
            String cnt=word.substring(i,i+1);
            if(cnt.equals(" ")) {
                ans=ans+" ";
                continue;
            }
            adress=A.indexOf(cnt);  
            ans=ans+A.substring(adress+n,adress+(n+1));
        }
        System.out.println(ans);
    }
}*/
