package ch12.sec03.exam01;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue"); // 회원ID가 blue
		Member obj2 = new Member("blue"); // 회원ID가 blue
		Member obj3 = new Member("red");  // 회원ID가 red
		
		EventMember em1 = new EventMember("철수", "male");
		EventMember em2 = new EventMember("철수", "male");

		//if (obj1 == obj2) -> false
		if(obj1.equals(obj2)) { // true
			System.out.println("obj1과 obj2는 동등합니다.(회원ID가 같은 회원)");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.(회원ID가 다른 회원)");
		}
		
		//if (obj1 == obj3) -> false
		if(obj1.equals(obj3)) { // false
			System.out.println("obj1과 obj3는 동등합니다.(회원ID가 같은 회원)");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.(회원ID가 다른 회원)");
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}
