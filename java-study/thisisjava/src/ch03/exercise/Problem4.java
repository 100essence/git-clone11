package ch03.exercise;

public class Problem4 {

	public static void main(String[] args) {
		int value = 356;
		// 산술 연산자만 사용하여 value가 300이 나오도록 하는 코드
		//System.out.println(value - value % 300);
		// 십의 자리 이하 버리는 코드
		// 356 / 100 -> 3.56 -> 소수점 버림 -> 3 * 100
		System.out.println((value / 100) * 100);
	}

}
