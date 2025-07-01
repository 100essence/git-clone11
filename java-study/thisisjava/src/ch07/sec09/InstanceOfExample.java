package ch07.sec09;

public class InstanceOfExample {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		if (p1 instanceof Person) {	 // true
			Student student = (Student)p1;
			student.walk();
			student.study();
		}
		
		System.out.println();
		
		Person p2 = (Person)new Student("김길동", 10);
		if (p2 instanceof Student s1) { // true
			//Student s1 = (Student) p2;
			s1.study(); 
			s1.walk();
		}
		
		//Student s1 = new Person("홍길동", 20);
	}
}
