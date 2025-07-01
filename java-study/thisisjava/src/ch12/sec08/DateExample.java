package ch12.sec08;

import java.text.*;
import java.time.LocalDateTime;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		// 날짜클래스
		Date now = new Date();
		String strNow1 = now.toString();		
		System.out.println(strNow1);
		
		// 형식 클래스
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

		// 현업에서 가장 많이 사용하는 날짜시간 클래스
		LocalDateTime ldt = LocalDateTime.now();  // 현재시간 가져오기
		String strNow3 = sdf.format(now);
		System.out.println(strNow3);
	}

}
