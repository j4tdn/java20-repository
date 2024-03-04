package dao;

import java.util.List;

import persistence.entities.Employee;

public class HibernateEmployeeDao extends BaseHibernateDao implements EmployeeDao {
	
	private static final String Q_GET_EMPLOYEE_HAVE_SALARY_MORE_THAN_MANAGER =
			"WITH CTE_MANAGER_SALARY AS\n"
			+ "(\n"
			+ "SELECT SALARY AS MANAGER_SALARY\n"
			+ "  FROM employee\n"
			+ "  WHERE ID in (SELECT MANAGER_ID FROM employee)\n"
			+ ") SELECT * \n"
			+ "    FROM employee e\n"
			+ "   WHERE e.SALARY > MANAGER_SALARY;";
	
	@Override
	public List<Employee> getEmployeeHaveSalaryMoreThanManager() {
		return openSession()
				.createNativeQuery(Q_GET_EMPLOYEE_HAVE_SALARY_MORE_THAN_MANAGER, Employee.class)
				.getResultList();
	}
	
}
