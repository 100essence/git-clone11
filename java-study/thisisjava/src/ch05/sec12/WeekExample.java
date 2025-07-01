package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		// 현재 요일 가져오기(1일 경우 일요일 ~ 7일 경우 토요일)
		int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		//if(today == Week.SUNDAY) {
		if(week == 1) {
			System.out.println("오늘 요일은 일요일 입니다.");
		} else {
			System.out.println("오늘 요일은 일요일이 아닙니다.");
		}
	}
	
	static void printItem() {  // 메소드 영역
		
	}
}
