package sec02_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class __ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while(true) { //input은 while문으로만 (for x)
			readByteNo = is.read(readBytes);
			System.out.println(readByteNo);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
