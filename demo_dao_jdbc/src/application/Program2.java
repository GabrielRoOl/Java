package application;

import modal.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.ceateDeparmentDao();
		
		System.out.println("\n=== TEST 1: insert ===");
		Department department = new Department(null, "test");
		departmentDao.insert(department);
		System.out.println("Insert New Department Id = " + department.getId());
		
		
		System.out.println("\n=== TEST 2: delete ===");
		departmentDao.deleteById(9);
		System.out.println("Delete executed.");

	}

}
