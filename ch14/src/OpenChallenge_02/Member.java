package OpenChallenge_02;

public class Member implements Comparable {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	public String getName() { return name; }
	
	public void setName(String name) {
		this.name = name;
		}
	
	public String getId() { return id; }
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() { return password; }
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() { return age; }
	
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object o) {
		if(o instanceof Member) {
			Member m = (Member) o;
			if (this.age > m.age) 
				return 1;
			
			if (this.age < m.age) 
				return -1;
			
			return 0;
		}
		return 100;
	}
}
