package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");  // 변수와 문자열을 같이 사용하는 방법
		
		int totalMinute = hour * 60 + minute;
		System.out.println("총 " + totalMinute + "분");  // 변수와 문자열을 같이 사용하는 방법
	}

}
