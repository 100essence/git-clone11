package ch07.sec10.exam01;

public class AbstractMethodExample {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		//animal.breath();  // error
	
		Dog dog = new Dog();
		dog.sound();		// 멍멍
		Cat cat = new Cat();
		cat.sound();		// 야옹
		
		animalSound(new Dog());		// 멍멍
		animalSound(new Cat());		// 야옹
	}
	
	// 매개변수 다형성(animal에는 Animal상속받은 클래스 모두 가능)
	static void animalSound(Animal animal) {
		animal.sound();
	}
}
