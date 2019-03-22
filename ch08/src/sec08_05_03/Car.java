package sec08_05_03;

public class Car {
	
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};

	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
