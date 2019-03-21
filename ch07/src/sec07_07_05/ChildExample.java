package sec07_07_05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();		//자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";	//field2 필드와 method3() 메소드는 Child 타입에만 선언되었으므로
		//parent.method3();
		
		Child child = (Child) parent;		//강제 타입 변환
		child.field2 = "yyy";
		child.method3();

	}

}
