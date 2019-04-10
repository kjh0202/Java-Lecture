package sec01_ArrayList;

import java.util.*;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");	//고정된 String객체를 요소로 갖는 ArrayList 객체 생성
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		//list2.remove(1);
		System.out.println(list2.get(1));
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
