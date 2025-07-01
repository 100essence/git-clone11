package ch07.sec11;

// Person클래스는 상속을 허용하되 Employee, Manager클래스만 상속을 허용
public sealed class Person permits Employee, Manager {
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
