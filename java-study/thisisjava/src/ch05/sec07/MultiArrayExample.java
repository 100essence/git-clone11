package ch05.sec07;

public class MultiArrayExample {

	public static void main(String[] args) {
		// 다차원 배열(2차원 배열 이상)
		int intArr1[];      // 1차원 배열 선언
		int intArr2[][];    // 2차원 배열 선언
		int intArr3[][][];  // 3차원 배열 선언
		
		intArr2 = new int[3][2];  // 2차원 배열 값 초기화
		intArr2[0][0] = 1;   // 인덱스가 0,0인 곳에 값을 1을 대입
		intArr2[0][1] = 2;   // 인덱스가 0,1인 곳에 값을 2을 대입
		intArr2[0][2] = 3;   // 인덱스가 0,2인 곳에 값을 3을 대입
		intArr2[1][0] = 4;   // 인덱스가 1,0인 곳에 값을 4을 대입
		
		int[][] intArr4 = { {1, 2, 3}, {4, 5} };
		for(int i = 0; i < intArr4.length; i++) {
			for(int j = 0; j < intArr4[i].length; j++) {
				System.out.println(intArr4[i][j]);
			}
		}
	}

}
