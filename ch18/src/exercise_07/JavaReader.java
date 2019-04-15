package exercise_07;

import java.io.FileReader;
import java.io.IOException;

public class JavaReader {
	 void javaReader() {
		FileReader freader = null;
		  try {
		   freader = new FileReader("D:/workspace1/EGov/Java/ch18/src/sec05_02_bufferdinputstreambufferreader/BufferedReaderExample.java");
		   int c;
		   int count = 1;
		   System.out.print(count++ + "   ");
		   while((c = freader.read()) != -1) {
		    System.out.print((char)c);
		    if(c == '\n')
		     System.out.print(count++ + "   ");
		   }
		   freader.close();
		  }
		  catch(IOException e) {
		   System.out.println("입출력 오류");
		  }
		 }
}
