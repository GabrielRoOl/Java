package atividadesOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.student;

public class atividadeNotaCort {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double absence = 1;
		
		student taught = new student();
		
		taught.nome = sc.nextLine();
		
		do{
			taught.nA = sc.nextDouble();
		}while(taught.pNA() == 1);

		do {
			taught.nB = sc.nextDouble();
		}while(taught.sNB() == 1);
			
		do {
			taught.nC = sc.nextDouble();
		}while(taught.sNC() == 1);
		
		if(taught.finalNota() < 60) {
			absence = 60 - taught.finalNota();
			System.out.println("Final grade = " + String.format("%.2f", taught.finalNota()));
			System.out.println("Failed");
			System.out.println("Missing " + String.format("%.2f", absence) + "Points");
		} else {
			System.out.println("Final grade = " + String.format("%.2f", taught.finalNota()));
			System.out.println("Pass");
		}
	}

}
