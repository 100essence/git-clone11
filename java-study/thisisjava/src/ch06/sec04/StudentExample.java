package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// 클래스이름 변수 = new 클래스이름();.
		// 클래스 변수(인스턴스) 생성(s1) 및 객체 생성(new Student())
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조: " + s1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조: " + s2);
		
		StudentExample a = new StudentExample();
		System.out.println("a 변수가 StudentExample 객체를 참조: " + a);
	}

}
