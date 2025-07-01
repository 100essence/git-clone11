package ch04.exercise;

public class Problem3 {

	public static void main(String[] args) {
		// for, if문(option)을 이용해서 1부터 100까지의 정수 중에서 3의 배수 총합을 출력하는 코드
		// 3 + 6 + 9 + 12 + ... + 99 
		// 첫번째 방법
		int sum = 0;
		for (int i = 3; i <= 100; i = i + 3) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 정수 중 3의 배수 총합: " + sum);
		
		// 두번째 방법
		sum = 0;
		for (int i = 3; i <= 100; i++) {
			if (i % 3 == 0) sum = sum + i;
		}
		System.out.println("1부터 100까지의 정수 중 3의 배수 총합: " + sum);
	}

}
