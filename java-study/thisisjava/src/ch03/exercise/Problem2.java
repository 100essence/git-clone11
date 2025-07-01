package ch03.exercise;

public class Problem2 {

	public static void main(String[] args) {
		// 삼항연산자 문제
		int score = 85;
		String result = (!(score > 90) ? "가": "나");
		System.out.println(result);   // 가
	}

}
