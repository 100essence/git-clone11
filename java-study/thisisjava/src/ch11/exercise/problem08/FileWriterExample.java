package ch11.exercise.problem08;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		try (FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
