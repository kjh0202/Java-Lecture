package __sec05_04_ComparableCompareTo;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person02> treeSet = new TreeSet<Person02>();
		
		treeSet.add(new Person02("홍길동", 45));
		treeSet.add(new Person02("감자바", 25));
		treeSet.add(new Person02("박지원", 31));
		
		for (Person02 person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}
}
