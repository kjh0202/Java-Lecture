package OpenChallenge_02;

public class OC_02 {
	public static void main(String[] args) {
        int j=0;
        String userinput = "4546793";
		StringBuilder number = new StringBuilder(userinput);
        char [] num = userinput.toCharArray();


        for(int i=0 ; i<num.length-1 ; i++,j++) {

            int a = Integer.parseInt(String.valueOf(num[i]));
            int b = Integer.parseInt(String.valueOf(num[i+1]));
            if(a%2==0 && b%2==0) {
                number.insert(j+1,"*");
                j++;
            }else if ((a!=0&&b!=0) && (a%2!=0 && b%2!=0)) {
                number.insert(j+1, "-");
                j++;
            }

        }
        System.out.print(number);
    }

}
