package OpenChallenge_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class wordExample {
	public static void main(String[] args) throws Exception {
		TreeSet<Word> wordSet = new TreeSet<Word>();
		FileReader fr = new FileReader("c:/Temp/song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.toString());

	}
		
}
