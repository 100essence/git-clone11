package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		//Member 객체 저장
		set.add(new Member("홍길동", 30)); // true
		set.add(new Member("홍길동", 30)); // false
		set.add(new Member("홍길동", 25)); // true
		set.add(new Member("유관순", 30)); // true
		set.add(new Member("강감찬", 40)); // true
		set.add(new Member("유관순", 30)); // false
		
		//저장된 객체수 출력
		System.out.println("총 객체수 : " + set.size());  // 4개
		
		// 이름은 강감찬이고 나이는 40인 회원을 삭제
		set.remove(new Member("강감찬", 40));
		System.out.println("총 객체수 : " + set.size());  // 3개
	}
}
