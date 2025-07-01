package ch12.sec03.exam02;

public class Student {
	private int no;		 // 학생번호
	private String name; // 학생이름
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() 
				&& name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "학생번호 -> " + this.no + 
				", 학생이름 -> " + this.name;
	}
}
