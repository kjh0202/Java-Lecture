package sec03_system_in_out;

import java.io.InputStream;

public class __SystemInExample2 {
	public static void main(String[] args) throws Exception {
			
		InputStream is = System.in;		//키보드 입력 스트림 얻기
		
		byte[] datas = new byte[100];
		
		System.out.print("이름: ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);	//끝에 2바이트는 Enter키에 해당하는 
		System.out.print("하고 싶은말: ");				//캐리지 리턴(13)과 라인 피드(10)이므로
		int commentBytes = is.read(datas);					//문자열에서 제외시킴
		String comment = new String(datas, 0, commentBytes-2);	//"
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);
	}
}
