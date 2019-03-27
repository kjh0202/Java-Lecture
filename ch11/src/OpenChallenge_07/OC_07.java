package OpenChallenge_07;

public class OC_07 {

	public static void main(String [] args) {
	    int a = 0; 
	    int b = 0; 
	     
	    for(a = 0; a<1000; a++) { 
	        for(b = 0; b<1000; b++) { 
	            if( ( 1000 * ( a + b) ) == (500000 + a * b)) {
	                 
	                System.out.println( "a : " + a + " b : " + b); 
	            } 
	        } 
	    } 
	    a = 200; 
	    b = 375; 
	    System.out.println( a * b * (1000 - a -b)); 
	} 
}

