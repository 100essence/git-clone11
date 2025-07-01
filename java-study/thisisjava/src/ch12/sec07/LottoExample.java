package ch12.sec07;

import java.util.Random;

public class LottoExample {
	public static void main(String[] args) {
		// 로또 1~45까지 같은 번호가 나오지 않도록 변경
		int[] selectNumber = new int[6]; // 0으로 초기화 -> [0,0,0,0,0,0]
		Random random = new Random();
		int lottoIndex = 1;
		
		// 첫번째 방법
//		while(true) {
//			int num = random.nextInt(45) + 1;
//		
//			boolean isDuplicate = false;
//			// 기존의 로또 배열에 들어간 숫자들이 같은 값이 있는지 비교
//			for (int i = 0; i < lottoIndex; i++) {
//				if(selectNumber[i] == num) {
//					isDuplicate = true;
//					break;
//				}
//			}
//			
//			if(!isDuplicate) {
//				selectNumber[lottoIndex - 1] = num;
//				lottoIndex++;
//			}
//			
//			if (lottoIndex == 7) {
//				break;
//			}
//		}
		// 두번째 방법
		int count = 0;
		while (count < 6) {
			int num = random.nextInt(45) + 1;
			
			boolean isDuplicate = false;
			for (int i = 0; i < count; i++) {
				if(selectNumber[count] == num) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				selectNumber[count] = num;
				count++;
			}
		}
		
		for(int num : selectNumber)
			System.out.print(num + " ");
	}

}
