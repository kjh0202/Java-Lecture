package OpenChallenge_01;

public class OC_01 {
    public static void main(String[] args) {
        String[] list = new String[991];
        int result = 0;
        for(int x = 10; x < 1001; x++) {
            list[x-10] = "" + x;
        }
        for(String i:list) {
            char[] temp = i.toCharArray();
            int mul = 1;
            for(char k:temp) {
                mul *= Character.getNumericValue(k);
            }
            result += mul;
        }
        System.out.println(result);
    }
}
