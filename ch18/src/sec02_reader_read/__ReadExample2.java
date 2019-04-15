package sec02_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class __ReadExample2 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readDataNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readDataNo = reader.read(cbuf);
			System.out.println(readDataNo);
			if(readDataNo == -1)
				break;
			data += new String(cbuf, 0, readDataNo);
		}
		System.out.println(data);
		reader.close();
	}
}
