package service;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new HibernateEmployeeDao();
	}
	
	
	
}
