package sec07_03;

public class Student extends People {
	public int stdentNo;

	public Student(String name, String ssn, int stdentNo) {
		super(name, ssn);
		this.stdentNo = stdentNo;
	}


	
}
