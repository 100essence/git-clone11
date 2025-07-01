package ch07.sec08.exam02;

public class Driver {
//	Taxi taxi1 = new Taxi();
//	Bus bus1 = new Bus();
//	
//	Vehicle taxi2 = new Taxi();
//	Vehicle bus2 = new Bus();
	
	public void drive1(Bus bus) {
		bus.run();
	}
	public void drive2(Taxi taxi) {
		taxi.run();
	}
	// 매개변수 다형성(Vehicle, Bus객체 및 Taxi객체 모두 전달 가능)
	public void drive3(Vehicle vehicle) {
		vehicle.run();
	}
}
