package ch06.sec08.exam02;

public class Computer {
	int sum(int... values) {		// values는 배열로 취급
		//System.out.println(values);
		
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i]; // 합산 시도
		}
		
		return sum;	// 합산 결과값 리턴
	}
	double sum(double... values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i]; // 합산 시도
		}
		
		return sum;	// 합산 결과값 리턴
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;  // return문을 만나면 그 이후의 실행문은 실행이 되지 않음
		
		//System.out.println(result);
	}
	
	int gas = 0;
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		System.out.println("gas가 있습니다");
		return true;
	}
}
