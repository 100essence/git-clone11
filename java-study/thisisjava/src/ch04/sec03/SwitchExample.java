package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
			case 1: case 2: case 8:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}

	}

}
