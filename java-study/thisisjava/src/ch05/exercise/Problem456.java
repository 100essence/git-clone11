package ch05.exercise;

public class Problem456 {
	public static void main(String[] args) {
		//int[] array = {1, 2, 3};
		//int[] array; array = new int[]{1, 2, 3};
		
		int[] a = new int[3];  // 초기값은 0
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		double[] b = new double[3];  // 초기값은 0.0
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		boolean[] c = new boolean[3];  // 초기값은 false
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		String[] d = new String[3];		// String은 참조타입. 참조타입의 배열 초기값은 null
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		
		int[][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};
		System.out.println(array.length);  // 3
		System.out.println(array[2].length);  // 5
	}
}
