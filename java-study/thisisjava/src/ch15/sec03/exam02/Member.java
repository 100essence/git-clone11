package ch15.sec03.exam02;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Member에 대한 hashCode 재정의(이름의 hashcode와 age숫자로 또 다른 hash값 생성)
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	// Member에 대한 equals 재정의(이름과 나이 둘 다 같을 때)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) 
					&& (target.age==age);
		} else {
			return false;
		}
	}	
}
