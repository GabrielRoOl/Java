package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.employee;

public class Funcionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, i, idBusca;

		Integer id, empl;
		String name;
		Double salary, percentage;
		List<employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Employee " + (i + 1) + "°:");
			
			System.out.print("Id: ");
			id = sc.nextInt();
			
			while(hasId(list, id) == true) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();

			System.out.print("Salary: ");
			salary = sc.nextDouble();

			employee emp = new employee(id, name, salary);

			list.add(emp);

		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		idBusca = sc.nextInt();

		// empl = findEmpoyeerById(list, idBusca);
		employee empl1 = list.stream().filter(x -> x.getIde() == idBusca).findFirst().orElse(null);

		if (empl1 == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			empl1.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		  
		for (employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static Integer findEmpoyeerById(List<employee> list, int id) {
		int i;

		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getIde() == id) {
				return i;
			}
		}

		return null;
	}
	
	public static boolean hasId(List<employee> list, int id) {
		employee emp = list.stream().filter(x -> x.getIde() == id).findFirst().orElse(null);
		return emp != null;
	}

}
