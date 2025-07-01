package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		String data = "新聞を見ています。";   // new String("자바", "UTF-8")
		
		// 언어 변환시(인코딩 <-> 디코딩) byte로 변환(ex) euc-kr -> utf-8,  utf-8 -> euc-kr)
		byte[] arr1 = data.getBytes();  // String -> byte로 변환
		System.out.println("arr1(utf-8): " + Arrays.toString(arr1));
		
		// byte(utf-8) -> String(utf-8)
		String str1 = new String(arr1);  // new String(arr1, "UTF-8")
		System.out.println("str1(utf-8): " + str1);
		
		// String(utf-8) -> byte(euc-kr)
		byte[] arr2 = data.getBytes("euc-kr");
		System.out.println("arr2(euc-kr): " + Arrays.toString(arr2));
		
		String str2 = new String(arr2, "euc-kr");
		System.out.println("str2(euc-kr): " + str2);
		
		byte[] arr3 = data.getBytes("Shift_JIS");  // euc-jp, Shift_JIS
		System.out.println("arr3(Shift_JIS): " + Arrays.toString(arr3));
		
		String str3 = new String(arr3, "Shift_JIS");
		System.out.println("str3(Shift_JIS): " + str3);
	}

}
