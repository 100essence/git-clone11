package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) throws Exception {
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean isLeftGas = myCar.isLeftGas();
		//isLeftGas 메소드 호출해서 받은 리턴값이 true 일 경우 if 블록 실행
		if(isLeftGas) {
			System.out.println("출발합니다.");
			
			//리턴값이 없는 run 메소드 호출
			myCar.run();  
		}
		
		System.out.println("gas를 주입하세요.");
	}

}
