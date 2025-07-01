package ch05.sec06;

public class MethodExample1 {
	
	public static void main(String[] args) {
		//배열 변수 선언
		int[] scores;
		//배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		//배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);	
		
		// 사용자 메소드 실행(메소드 이름과 파라미터 세팅)
		printItem(new int[] { 83, 90, 87 });
	}
	
	// 함수 선언 문법: 리턴타입 함수이름(파라미터) -> 파라미터는 생략 가능
	// 사용자 메소드(함수) 선언(ex) y=f(x))
	static void printItem(int[] scores) {
		for(int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}
	
}
