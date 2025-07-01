package ch12.exercise.problem15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Example {
	public static void main(String[] args) {
		// 현재시간
		LocalDateTime nowDate = LocalDateTime.now();
		// 현재년도의 마지막 날(현재시간의연도.12.31 00:00:00)
		LocalDateTime endDate = LocalDateTime.of(nowDate.getYear(), 12, 31, 0, 0, 0);
		
		long remainDay = nowDate.until(endDate, ChronoUnit.DAYS);
		System.out.println("올해 남은 일자: " + remainDay);
	}

}
