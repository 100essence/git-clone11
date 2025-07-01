package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// 가변 길이 파라미터 호출 예제
		Computer com1 = new Computer();
		int[] values1 = {1, 2, 3};
		int result1 = com1.sum(values1);  // 6
		System.out.println(result1);
		 
		int[] values2 = {1, 2, 3, 4, 5};
		int result2 = com1.sum(values2);  // 15
		System.out.println(result2);
		
		int result3 = com1.sum(1,2,3,4,5);  // 15
		int result4 = com1.sum(1,2,3);		// 6
		
		System.out.println(1);
		System.out.println("1");
		System.out.println(1.0);
	}

	
}
