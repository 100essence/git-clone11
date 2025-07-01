package ch06.exercise;

// 15번 문제
public class MemberService {
	boolean login(String id, String pw) {
		if(id != null && pw != null &&
			id.equals("hong") && pw.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
