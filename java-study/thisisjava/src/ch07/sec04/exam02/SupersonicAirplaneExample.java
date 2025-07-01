package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();	// 부모 메소드
		sa.fly();		// 자식 메소드
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		// 자식 메소드
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();		// 자식 메소드
		sa.land();		// 부모 메소드
	}
}
