package __sec05_04_ComparableCompareTo;

public class Person02 implements Comparable<Person02> {
	public String name;
	public int age;
	
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person02 o){	//나이에 따른 오름차순
		if (this.age < o.age) return -1;
		else if (this.age == o.age) return 0;
		else return 1;
	}
}
