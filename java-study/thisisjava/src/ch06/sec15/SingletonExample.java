package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//동일한 객체를 참조하는지 확
		if(s1 == s2) {   
			System.out.println("같은 Singleton 객체 입니다."); // 출력
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
