package model.dao;

import java.util.List;

import modal.entities.Department;

public interface DeparmentDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Department obj);

	Department findById(Integer id);

	List<Department> findAll();

}
