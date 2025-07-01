package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		// Random함수 사용하기
		double rnd = Math.random();   // 0.0 ~ 1.0(1.0은 포함이 안됨 -> 0.0 <= 난수 < 1.0) 사이의 난수가 발생
		System.out.println(rnd);
		
		// 0보다 작은 소수로 된 숫자를 정수로 바꾸는 방법
		int rndInt2 = (int)(rnd * 100);  // 2자리 정수
		int rndInt3 = (int)(rnd * 1000);  // 3자리 정수
		int rndInt4 = (int)(rnd * 10000);  // 4자리 정수
		System.out.println(rndInt2);
		System.out.println(rndInt3);
		System.out.println(rndInt4);
		
		// 주사위 1 ~ 6사이 값이 나오도록 하는 방법
	    int diceNumber = (int)(rnd * 6) + 1; // 0 ~ 5, 1은 초기값 -> 1 ~ 6
	    System.out.println("주사위 숫자는 " + diceNumber);
	    
	    // 로또번호 1 ~ 45사이 값이 나오도록 하는 방법
	    int lottoNumber = (int)(rnd * 45) + 1;
	    System.out.println("로또번호 숫자는 " + lottoNumber);
	    
	    System.out.println("-----------------------------------------");
    	int num = (int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {	
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
