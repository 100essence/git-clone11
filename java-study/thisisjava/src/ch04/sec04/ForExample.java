package ch04.sec04;

public class ForExample {

	public static void main(String[] args) {
		// 패턴이 있는 반복문
		//   ex) 1씩 증가하는 패턴
		int sum = 0;
		sum = sum + 1; // 0 + 1 = 1
		sum = sum + 2; // 0 + 1 + 2 = 3
		sum = sum + 3; // 0 + 1 + 2 + 3 = 6
		sum = sum + 4; // .
		sum = sum + 5; // .
		System.out.println("1~5까지의 합: " + sum);
		
		
		// for문 활용
		sum = 0;  // 초기화
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합: " + sum);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		//int i = 0, j = 1, k = 5;
		for(int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
			
		}

		int k;
		for(k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
		for(k = 10; k >= 1; k--) {
			System.out.print(k + " ");
		}
	}

}
