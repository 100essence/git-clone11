package ch08.sec11.exam02;

public class InstanceOfExample {
	public static void main(String[] args) {
		//구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		//ride 메소드 호출시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {  // 객체 타입 확인
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		if(vehicle instanceof Bus bus) { // 객체 타입 확인
			bus.checkFare();	
		}
	}
} 
