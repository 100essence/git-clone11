package ch05.sec03;

public class ReferencePrimitiveExample {

	public static void main(String[] args) {
		// primitive type의 ==, != 연산자 사용
		int a1 = 1;
		int a2 = 1;
		if (a1 == a2)
			System.out.println("a1과 a2의 값이 같다");
		else
			System.out.println("a1과 a2의 값이 다르다");
		
		// reference type의 ==, != 연산자 사용
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		if (arr1 == arr2)
			System.out.println("arr1과 arr2의 참조가 같다");
		else
			System.out.println("arr1과 arr2의 참조가 다르다");
		
		// 배열의 값을 비교하여 동일한지 판단하는 방법
		boolean isArr1Arr2Equal = true;
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) { // arr1의 인덱스 번호와 arr2의 인덱스 번호들의 값이 1개라도 다를 경우
				isArr1Arr2Equal = false;
				break;
			}
		}
		System.out.println("arr1과 arr2의 값이 " + (isArr1Arr2Equal ? "같다?" : "다르다"));
		
		// arr3에 arr2의 참조타입을 대입
		int[] arr3 = arr2;
		if (arr3 == arr2)
			System.out.println("arr3과 arr2의 참조가 같다");
		else
			System.out.println("arr3과 arr2의 참조가 다르다");
	}

}
