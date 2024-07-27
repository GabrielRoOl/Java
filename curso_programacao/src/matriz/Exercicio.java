package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[][] matriz = new int[n][x];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int pertenceMatriz = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(pertenceMatriz == matriz[i][j]) {
					System.out.println("Position " + i + ", " + j + ":");
					if(j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j - 1]);					
					}
					if(j + 1 < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j + 1]);						
					}
					if(i - 1 >= 0) {
						System.out.println("Up: " + matriz[i - 1][j]);						
					}
					if(i + 1 < matriz.length) {
						System.out.println("Down: " + matriz[i + 1][j]);						
					}
				}
			}
		}
	}

}
