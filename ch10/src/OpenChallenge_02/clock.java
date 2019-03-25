package OpenChallenge_02;

public class clock {

    public static void main(String[] args) {
        int hour,min;
        int seconds=0;
        for (hour=0; hour<24; hour++)
            for (min=0; min<60; min++) {
                if(hour%10==3 || min%10==3 || min/10==3)
                    seconds+=60;
        }
        
        System.out.println(" 디지털 시계에 3이 표시되는 시간 = "  + seconds);
	       
	}
}