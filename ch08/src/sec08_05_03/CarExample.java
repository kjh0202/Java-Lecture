package sec08_05_03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("-------------------------");
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1]= new KumhoTire();
		
		myCar.run();
	}
}
