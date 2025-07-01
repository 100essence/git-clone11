package ch03.exercise;

public class Problem3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students; // 나눗셈 연산자
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencils % students; // 나머지 연산자
		System.out.println(pencilsLeft);
	}

}
