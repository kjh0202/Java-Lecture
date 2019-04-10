package sec05_04_Comparator_Descending;

import java.util.*;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());	//내림차순
		treeSet.add(new Fruit("포도", 3000));	//저장될 때 가격을 기준으로 내림차순 정렬됨
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}

}
