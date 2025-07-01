package ch04.sec04;

public class ForNestedExample {

	public static void main(String[] args) {
		// 중첩 for문(for문이 2개이면 이중for문)f
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + ", " + j);
			}
		}
	}

}
