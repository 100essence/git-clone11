package ch12.exercise.problem16;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		LocalDateTime nowDate = LocalDateTime.now();	// 현재 시간
		
		// LocalDateTime -> Date
		Date nowDate2 = Date.from(nowDate.atZone(ZoneId.systemDefault()).toInstant());
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(nowDate2));
	}

}
