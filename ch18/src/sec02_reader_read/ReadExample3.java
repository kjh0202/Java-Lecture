package sec02_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readDataNo;
		char[] cbuf = new char[4];
		readDataNo = reader.read(cbuf, 1, 2);
		System.out.println(readDataNo);
			for(int i=0; i<cbuf.length; i++) {
				System.out.println(cbuf[i]);
			}
			reader.close();
	}
}
