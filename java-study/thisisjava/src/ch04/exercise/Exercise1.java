package ch04.exercise;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Exercise1 {

	public static void main(String[] args) {
		// 요일(1 ~ 7) -> 1:월요일 ~ 7:일요일
		LocalDateTime now = LocalDateTime.now(); // 현재 시간
		System.out.println(now);
		System.out.println(now.getDayOfWeek()); //  현재 요일
	
		// 1. 오늘의 요일을 한글로 출력하는 코드(if 혹은 switch 사용)
		String day = now.getDayOfWeek().toString();
		switch(day) {
		case "MONDAY":
			 System.out.println("월요일");
			 break;
		case "TUESDAY":
			 System.out.println("화요일");
			 break;
		case "WEDNESDAY":
			 System.out.println("수요일");
			 break;
		case "THURSDAY":
			 System.out.println("목요일");
			 break;
		case "FRIDAY":
			 System.out.println("금요일");
			 break;
		case "SATURDAY":
			 System.out.println("토요일");
			 break;
		case "SUNDAY":
			 System.out.println("일요일");
			 break;
		}
		
		// 2. 아래 코드를 실행했을 때 출력 결과
		// 나이가 30세이하이고 학생이면 할인 적용
		int age = 25;
		boolean isStudent = true;

		if (age < 30 && isStudent) {
		    System.out.println("할인 적용 가능");
		} else {
		    System.out.println("할인 불가");
		}
		
		String a = "test";
		switch(a) {
		case "test":
			System.out.println("테스트입니다");
			break;
		default:
			System.out.println(a);
		}
		// 3. 다음 중 switch문으로는 처리할 수 없는 경우는 무엇인가요?
        //    a) 정수 값에 따른 메뉴 처리
        //    b) 문자열에 따른 명령 처리 (Java 7 이상)
        //    c) 범위 비교 (예: x >= 10 && x < 20) -> true, false
        //    d) 특정 문자에 따른 출력 처리
	}

}
