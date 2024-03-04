package service;

import java.util.List;

import persistence.entities.Employee;

public interface EmployeeService {
	List<Employee> getEmployeeHaveSalaryMoreThanManager();
}
