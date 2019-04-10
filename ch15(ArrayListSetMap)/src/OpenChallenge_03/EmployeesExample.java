package OpenChallenge_03;

import java.time.LocalDate;
import java.util.TreeSet;

public class EmployeesExample {
	public static void main(String[] args) {
	
	TreeSet<Employees> treeSet = new TreeSet<Employees>();
	treeSet.add(new Employees(8001, "김자바", "부장", LocalDate.of(2017, 8, 27)));
	treeSet.add(new Employees(8002, "한석규", "부장", LocalDate.of(2015, 4, 7)));
	treeSet.add(new Employees(8003, "조자룡", "차장", LocalDate.of(2018, 1, 10)));
	treeSet.add(new Employees(8004, "구재석", "차장", LocalDate.of(2019, 2, 16)));
	treeSet.add(new Employees(8005, "최영희", "과장", LocalDate.of(2017, 3, 11)));
	treeSet.add(new Employees(8006, "손미선", "과장", LocalDate.of(2018, 9, 04)));
	treeSet.add(new Employees(8007, "장선희", "대리", LocalDate.of(2019, 1, 21)));
	treeSet.add(new Employees(8008, "홍길동", "대리", LocalDate.of(2018, 4, 02)));
	treeSet.add(new Employees(8009, "김미영", "사원", LocalDate.of(2019, 3, 30)));
	treeSet.add(new Employees(8010, "박소미", "사원", LocalDate.of(2016, 6, 26)));
	
	treeSet.add(new Employees(8011, "강자바", "부장", LocalDate.of(2017, 8, 20)));
	//treeSet.add(new Employees(8011, "강자바", "부장", LocalDate.parse("1998-01-01")));
	
	for (Employees employees : treeSet) {
		System.out.println(employees);
	}
	System.out.println();
	
	}
}
