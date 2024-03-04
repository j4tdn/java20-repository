package dao;

import java.util.List;

import persistence.entities.Employee;

public class HibernateEmployeeDao extends BaseHibernateDao implements EmployeeDao {
	
	@Override
	public List<Employee> getEmployeeHaveSalaryMoreThanManager() {
		return null;
	}
	
}
