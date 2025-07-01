package ch05.sec06;

public class ArrayExample1 {

	public static void main(String[] args) {
		// 배열이 없을 때(숫자를 for문에서 사용 불가능)
		int score0 = 10;
		int score1 = 20;
		int score2 = 30;
		
		int scoreSum = score0 + score1 + score2;
		for(int i = 0; i < 100; i++) {
			//System.out.println(score + i);
		}
		
		// score관련 변수가 1만개 있다면...???
		// 배열이 있을 때(숫자를 for문에서 사용 가능)
		int[] score = null;   // 배열 변수 선언
		score = new int[100]; // 배열 변수에 공간을 할당(인덱스번호는 0~99)
		
		int[] score10 = {10, 20, 30, 40, 50};
		score10[0] = 80;  // 기존 10을 80으로 변경(overwrite)
		// score10[1] = 20
		// score10[2] = 30
		
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		//score[100] = 30;  // 실행시 에러 발생
		
		String[] strArr = {"홍길동", "유관순", "강감찬"};
		for(int i = 0; i < 3; i++) {
			System.out.println(strArr[i]);
		}
	}

}
