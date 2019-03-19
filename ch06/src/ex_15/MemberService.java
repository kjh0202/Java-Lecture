package ex_15;

public class MemberService {
	
	boolean login(String id, String pw) {
		boolean result = false;
		if((id.equals("hong"))&&(pw.equals("12345"))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	void logout(String id) {
		if(id == "hong") {
		System.out.println("로그아웃 되었습니다.");}						
	}

}
