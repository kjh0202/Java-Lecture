package sec07_03;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
/*	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}*/
	
	public Korean(String name, String ssn) {
		this.name = name; //this.name(필드의 String name) name=(생성자의 String name)
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

}
