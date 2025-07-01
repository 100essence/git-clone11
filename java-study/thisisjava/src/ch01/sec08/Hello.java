package ch01.sec08;

/** 해당 주석은 javadoc에서 해석
 * @author 홍길동
 * @version 1.0.0
 * @category 연습용
 * description
 *   - 장제목: 1장 자바 시작하기
 *   - 작성일: 2025.06.09
 */
/* 해당 주석은 javadoc에서 해석하지 않음
  - 장제목: 1장 자바 시작하기
  - 작성일: 2025.06.09
 */
public class Hello {
	/**
	 * @param args
	 *   - args: 실행 시점에 넘겨야할 파라미터 값들
	 */
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		// 콘솔에 출력하는 실행문
		System.out.println("Hell/*주석이 될 수 없음*/o");
		
		/*
		 * 콘솔에 출력하는 실행문
		 */
		int x;		// 변수 x선언
		x = 1;		// 변수 x에 1값을 저장
		int y = 2;  // 변수 y를 선언하고 2값을 저장
		//int result = x + y;
		int result 
  = x + y;
		System.out.print(result);
		
		int a = 1;  int b = 2;
		
	}
}
