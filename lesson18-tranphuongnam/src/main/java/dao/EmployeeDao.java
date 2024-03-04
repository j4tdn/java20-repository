package dao;

import java.util.List;

import persistence.entities.Employee;

public interface EmployeeDao {

	List<Employee> getEmployeeHaveSalaryMoreThanManager();
	
}
