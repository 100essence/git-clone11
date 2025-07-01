package ch06.exercise;

public class Member {
	String name; // 이름
	String id;   // 아이디
	String password;  // 패스워드
	short age;		// 정수
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	boolean login() { return false; }
}
