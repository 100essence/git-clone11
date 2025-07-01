package ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		p.work();
		e.work();
		m.work();
		d.work();
		System.out.println();
		Person p1 = new Employee();
		Person p2 = new Manager();
		Person p3 = new Director();
		p1.work();
		p2.work();
		p3.work();
	}

}
