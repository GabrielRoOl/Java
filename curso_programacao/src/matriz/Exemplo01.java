package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// int y = sc.nextInt();
		int i, j = 0;
		int negative = 0;
		int [][] mat = new int[n][n];
		for(i = 0; i < mat.length; i++) {
			for(j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					negative++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int k = 0; k < mat.length; k++) {
			System.out.print(mat[k][k] + " ");
		}
		System.out.println("\nNegative numbers: " + negative);



	}

}
