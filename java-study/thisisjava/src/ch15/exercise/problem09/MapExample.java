package ch15.exercise.problem09;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0;		// 최고 점수를 저장하는 변수
		int totalScore = 0;		// 점수 합계를 저장하는 변수
		
		// 여기에 코드를 작성하세요
		// 첫번째 방법
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {
//			String k = keyIterator.next();
//			Integer v = map.get(k);
//		
//			// 최고점수 구하기
//			if(v > maxScore) {
//				maxScore = v;
//				name = k;
//			}
//			// 점수 합계 구하기
//			totalScore += v; // unboxing(Integer -> int)
//		}
		
		// 두번째 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			
			// 최고점수 구하기
			if(v > maxScore) {
				maxScore = v;
				name = k;
			}
			// 점수 합계 구하기
			totalScore += v; // unboxing(Integer -> int)
		}
		System.out.println();
		
		// 평균 점수
		int avgScore = totalScore / map.size();
		System.out.println("평균 점수: " + avgScore);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);	
	}

}
