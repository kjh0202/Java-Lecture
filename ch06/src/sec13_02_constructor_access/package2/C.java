package sec13_02_constructor_access.package2;	//패키지가 다름

import sec13_02_constructor_access.package1.A;

public class C {
	//필드
	A a1 = new A(true);		//(o)
	//A a2 = new A(1);		//(X) default 생성자 접근 불가(컴파일 에러)
	//A a3 = new A("문자열");	//(X) private 생성자 접근 불가(컴파일 에러)
}
