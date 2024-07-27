package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramReaderBuffere {

	public static void main(String[] args) {

//		try (BufferedReader br = new BufferedReader(
//				new FileReader("C:\\Users\\Gabriel\\Documents\\Curso java\\texto de exemplo.txt"))) {
//			String line = br.readLine();
//
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Error " + e.getMessage());
//		}

		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" };

		String path = "C:\\Users\\Gabriel\\Documents\\Curso java\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
