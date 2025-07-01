package ch06.sec06.exam00;

public class CarExample {

	public static void main(String[] args) {
		Car avante = new Car();
		avante.color = "white";
		
		System.out.println("speed: " + avante.speed);	// 0
		System.out.println("model: " + avante.model);   // 그랜저
		System.out.println("color: " + avante.color);   // white
		System.out.println("company: " + avante.company); // null
	}

}
