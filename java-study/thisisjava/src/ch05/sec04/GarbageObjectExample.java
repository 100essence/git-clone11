package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;  		// "여행"에 해당하는 String 객체를 garbage로 만듬
		
		String kind1 = "자동차";
		String kind2 = kind1;		// kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;				// "자동차"에 해당하는 String 객체는 garbage가 아님
		System.out.println("kind2: " + kind2);  // null?  자동차?
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr1 = null;		// arr1 -> null,   arr2 -> {1,2,3}
		System.out.println("arr2: " + arr2.length);
		
		int[] arr3 = {1, 2, 3};
		int[] arr4 = arr3;
		arr3 = new int[3];		// arr3 -> {0,0,0},  arr4 -> {1,2,3}
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");  // {0,0,0} ?   {1,2,3} ?
		}
	}

}
