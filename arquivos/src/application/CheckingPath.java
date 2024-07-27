package application;

import java.io.File;
import java.util.Scanner;

public class CheckingPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a file: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// SOMENTE O NOME DO ARQUIVO
		System.out.println("getName: " + path.getName());

		// SOMENTE O CAMINHO
		System.out.println("getParent: " + path.getParent());

		// SOMENTE O CAMINHO COMPLET
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
