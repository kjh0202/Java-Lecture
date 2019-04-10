package sec03_Set_02;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>(); //방법1
		
		set.add(new Member("홍길동", 30, "010-2333-4567"));	
		set.add(new Member("홍길동", 40, "010-5124-4567"));
		//Member에서 name과 age만 비교(같음)
		System.out.println("총 객체수: " + set.size());	//저장된 객체 수 얻기
		
/*		Set<Member> set = new HashSet<Member>();  //방법2
		Member m1 = new Member("홍길동", 30, "010-2333-4567");	
		Member m2 = new Member("홍길동", 40, "010-5124-4567");	
		if (m1 == m2)
			System.out.println("==성립");
		else
			System.out.println("==불성립");
		set.add(m1);
		set.add(m2);
		System.out.println("총 객체수: " + set.size());	//저장된 객체 수 얻기
*/	}

}