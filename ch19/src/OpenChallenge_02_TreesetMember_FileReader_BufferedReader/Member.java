package OpenChallenge_02_TreesetMember_FileReader_BufferedReader;

public class Member implements Comparable<Member> {
	private String name;
	private String email;
	private String tel;
	
	public Member(String name, String email, String tel) {
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() { return name; }

	public String getEmail() { return email; }

	public String getTel() { return tel; }

	@Override
	public int compareTo(Member o) {
		if ( name.compareTo(o.getName()) > 0 ) return 1;
		if ( name.compareTo(o.getName()) < 0 ) return -1;
		return tel.compareTo(o.getTel());
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}
	
}