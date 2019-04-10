package OpenChallenge_02;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("김자바","rlawkqk","1111",29);
		Member m2 = new Member("홍길동","rlawkqk","1234",16);
		Member m3 = new Member("이젠","rlawkqk","4545",39);
		Member m4 = new Member("김자바","rlawkqk","0908",29);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m1.compareTo(m4)); 
	}
}
