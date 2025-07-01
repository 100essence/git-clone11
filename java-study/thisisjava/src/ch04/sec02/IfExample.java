package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 61;
		
		if(score >= 90) {   // score가 90이거나 90보다 크면 true
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89입니다"); 
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다"); 
			System.out.println("등급은 C 입니다.");
		} else {   
			System.out.println("점수가 70보다 작습니다."); 
			System.out.println("등급은 D 입니다.");
		}
	}

}
