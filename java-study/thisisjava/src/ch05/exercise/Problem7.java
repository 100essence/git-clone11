package ch05.exercise;

public class Problem7 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};  // 최대값 8
		int[] array2 = {9, 3, 2};       // 최대값 9
		
		int max = array[0];
		// 최대값을 구하기 위한 알고리즘
		for(int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		} 
	}
}
