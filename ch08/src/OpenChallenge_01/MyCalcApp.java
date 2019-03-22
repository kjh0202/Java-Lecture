package OpenChallenge_01;

import OpenChallenge_02.MyMultiImpl;

public class MyCalcApp {
	public static void main(String args[]){
		
		MyCalc myCale = new MyCalc();
		int x = 34;
		int y = 12;
		
		myCale.add(x, y);
		myCale.subtract(x, y);
		myCale.multiply(x, y);
		
		System.out.println("x=" + x + "," + "y="+ y);
		System.out.println("add: " + myCale.add(x, y));
		System.out.println("subtract: " + myCale.subtract(x, y));
		System.out.println("multiply: " + myCale.multiply(x, y));

	}

}

