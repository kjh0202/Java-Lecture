package sec08_06;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();				//InterfaceA변수는 mothodA()만 호출 가능
		System.out.println();		
		
		InterfaceB ib = impl;
		ib.methodB();				//InterfaceB변수는 mothodB()만 호출 가능
		System.out.println();		
		
		InterfaceC ic = impl;		//InterfaceB변수는 mothodA(), mothodB(),mothodC() 모두 호출 가능
		ic.methodA();			
		ic.methodB();
		ic.methodC();

	}

}
