package sec04_01_02_Map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {		//학번과 이름이 동일할 경우 true를 리턴
		Student student = (Student) obj;
		return name.equals(student.name);
		//return (sno==student.sno) && (name.equals(student.name));
	}

	@Override
	public int hashCode() {					//학번과 이름이 같다면 동일한 값을 리턴
		// TODO Auto-generated method stub
		return sno;
		//return sno + name.hashCode();
	}
	
	
}
