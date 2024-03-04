package service;

import java.util.List;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;
import persistence.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new HibernateEmployeeDao();
	}
	
	
	@Override
	public List<Employee> getEmployeeHaveSalaryMoreThanManager() {
		return employeeDao.getEmployeeHaveSalaryMoreThanManager();
	}
}
