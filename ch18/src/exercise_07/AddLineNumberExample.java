package exercise_07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception { 
	String filePath = "D:/workspace1/EGov/Java/ch18/src/sec05_02_bufferdinputstreambufferreader/BufferedReaderExample.java";
	
	FileReader fr = new FileReader(filePath);
	BufferedReader br = new BufferedReader(fr);
	
	int rowNumber = 0;
	String rowData;
		while( (rowData=br.readLine())!= null ) {
			System.out.println(++rowNumber + ": " + rowData);
		}
	
		br.close(); fr.close();
	}
}

	
