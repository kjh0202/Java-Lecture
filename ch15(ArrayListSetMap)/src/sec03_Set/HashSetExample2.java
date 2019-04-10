package sec03_Set;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30, "010-2333-4567"));	
		set.add(new Member("홍길동", 30, "010-5132-4567"));
		//Member에서 name과 age만 비교(같음)
		
		System.out.println("총 객체수: " + set.size());	//저장된 객체 수 얻기
	}

}
