package OpenChallenge_04;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OC_04 {
	public static void main (String[] args) throws java.lang.Exception
	{
	int sum = 0, square = 0;
	 
	Scanner scan = new Scanner(System.in);
	 
	System.out.print("범위를 지정하세요 : ");
	String mixStr = scan.nextLine();
	int mixNum = Integer.parseInt(mixStr);
	 
	for(int i=1; i<=mixNum; i++){
	sum += (int)Math.pow((double)i, 2);
	square += i;
	}
	 
	square = (int)Math.pow((double)square, 2);
	 
	System.out.println(square + " - " + sum + " = " + (square - sum));
	}
	}



//1~100 : 25164150