package application;

import modal.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.ceateDeparmentDao();

		System.out.println("\n=== TEST 1: insert ===");
//		Department department = new Department(null, "test");
//		departmentDao.insert(department);
//		System.out.println("Insert New Department Id = " + department.getId());
		System.out.println("Success");

		System.out.println("\n=== TEST 2: delete ===");
//		departmentDao.deleteById(9);
//		System.out.println("Delete executed.");
		System.out.println("Success");

		System.out.println("\n=== TEST 3: findById===");
//		System.out.println(departmentDao.findById(2));
		System.out.println("Success");

		System.out.println("\n=== TEST 4: findAll ===");
//		System.out.println(departmentDao.findAll());
		System.out.println("Success");

		System.out.println("\n=== TEST 5: update ===");

//		Department department = new Department();
//		department = departmentDao.findById(7);
//		department.setName("Churrass");
//		departmentDao.update(department);
//		System.out.println("Update completed.");
		System.out.println("Success");

	}

}
