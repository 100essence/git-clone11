package ch11.sec04;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args)  {
		FileInputStream a;
		
		try (FileInputStream fis1 = new FileInputStream("file1.txt");
			 FileInputStream fis2 = new FileInputStream("file2.txt")
		) {
			System.out.println("try-with-resource 연습");
		} catch(IOException e) {
			System.out.println("file1.txt 혹은 file2.txt파일이 없습니다." + e.getMessage());
		}
		
//		FileInputStream fis1 = new FileInputStream("file1.txt");
//		FileInputStream fis2 = new FileInputStream("file2.txt");
//		try (fis1; fis2)
//		{
//			System.out.println("try-with-resource 연습");
//		} catch(IOException e) {
//			System.out.println("file1.txt 혹은 file2.txt파일이 없습니다." + e.getMessage());
//		}
		
		// 예외가 없는 코드
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		System.out.println();
		
		// 예외가 발생한 코드
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		System.out.println();
		
		// try-with-resource에서 여러개 객체를 사용하는 방법
		MyResource res1 = new MyResource("A"); 
		MyResource res2 = new MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
