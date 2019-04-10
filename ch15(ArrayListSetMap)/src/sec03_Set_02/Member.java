package sec03_Set_02;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public String tel;
	
	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {	//name과 tel 값이 같으면 true를 리턴
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name);	//방법1(tel생략가능)
			//return member.name.equals(name) && (member.tel == tel);//방법2
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {				//name과 tel 값이 같으면 동일한 hashCode가 리턴
		return Objects.hash(tel);	//방법1(name생략가능)
		//return name.hashCode() + tel.hashCode();	//방법2
	}
	
}
