package ch12.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet(); 
		List<Student> list = new ArrayList();
		HashMap<Integer, Student> hashMap = new HashMap();

		Student s1 = new Student(1, "홍길동");
		System.out.println(hashSet.add(s1));	// true
		System.out.println("저장된 객체 수: " + hashSet.size());  // 1
		
		Student s2 = new Student(1, "홍길동");
		// 기존의 있는 student 1번객체와 같은 객체(hashCode가 같고 equals가 true)
		System.out.println(hashSet.add(s2));    // false		
		System.out.println("저장된 객체 수: " + hashSet.size());  // 1
		
		Student s3 = new Student(2, "홍길동");
		// 기존의 있는 student 1번객체와 다른 객체(hashCode가 다르고 equals가 true)
		System.out.println(hashSet.add(s3));    // true		
		System.out.println("저장된 객체 수: " + hashSet.size());  // 2
	}

}
