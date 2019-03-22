package sec08_05_06;

import sec08_05_04.Vehicle;
import sec08_05_05.Bus;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
