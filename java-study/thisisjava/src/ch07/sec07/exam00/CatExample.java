package ch07.sec07.exam00;

public class CatExample {
	public static void main(String[] args) {	
		Animal animal1 = new Animal();
		Cat cat1 = new Cat();
		
		Animal animal2 = cat1;		// 자동 형변환
		Animal animal3 = new Cat();	// 자동 형변환
		
		if (cat1 == animal2) { // true
			System.out.println("cat1과 animal2는 같은 참조에 있음");
		} else {
			System.out.println("cat1과 animal2는 다른 참조에 있음");
		}
	}
}
