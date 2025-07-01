package ch12.exercise.problem05;

import java.util.Objects;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNum);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(studentNum, other.studentNum);
//	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(studentNum.equals(target.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
}
