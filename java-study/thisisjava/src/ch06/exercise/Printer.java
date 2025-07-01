package ch06.exercise;

// 16번 문제
public class Printer {
	// 메소드 오버로딩
	static void println(int value) {
		System.out.println(value);
	}
	static void println(boolean value) {
		System.out.println(value);
	}
	static void println(double value) {
		System.out.println(value);
	}
	static void println(String value) {
		System.out.println(value);
	}
}
