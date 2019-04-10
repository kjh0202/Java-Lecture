package sec04_01_02_Map;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
/*		Map<Student, Integer> map = new HashMap<Student, Integer>(); //방법1
		
		map.put(new Student(1, "홍길동"), 95);		//학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());  	//저장된 총 Map.Entry수 얻기
		System.out.println(map.get(new Student(1, "홍길동"), 95);	*/
		
		Map<Student, Integer> map = new HashMap<Student, Integer>(); //방법2
		Student s = new Student(1, "홍길동");
		
		map.put(new Student(1, "홍길동"), 95);		//학번과 이름이 동일한 Student를 키로 저장
		System.out.println("Value = " + map.get(s));
		map.put(s, 90);
				
		System.out.println("총 Entry 수: " + map.size());  	//저장된 총 Map.Entry수 얻기
		System.out.println("Value = " + map.get(s));	
	}
}
