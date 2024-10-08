package application;

import java.io.File;
import java.util.Scanner;

public class ManipulationFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// Mostrar pastas
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// Mostrar arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
	
		// Criar uma nova pasta
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
	}

}
