package exampleVect;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.people;

public class height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, i, idade, menoresDezeseis = 0;
		double altura, alturaPessoas = 0, alturaMedia = 1, percentMenor = 0;
		String name;

		System.out.print("Quantas pessoas serão digitadas? ");

		n = sc.nextInt();

		people[] vect = new people[n];

		for (i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "° pessoa:");
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			vect[i] = new people(name, idade, altura);

			alturaPessoas += altura;
			if (idade < 16) {
				menoresDezeseis++;
			}
		}

		alturaMedia = alturaPessoas / vect.length;
		System.out.println("Altura média: " + alturaMedia);

		percentMenor = menoresDezeseis * 100 / vect.length;
		System.out.println("Pessoas com menos de 16 anos: " + percentMenor + "%");
		for (i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();

	}

}
