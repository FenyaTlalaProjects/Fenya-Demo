package za.co.ltsmwebsystem.dao;

import java.util.List;
import java.util.Set;

import za.co.ltsmwebsystem.model.Employee;

public interface EmployeeDaoInt {
	
	String saveEmployee(Employee employee);
	Employee getEmployeeByEmpNum(String empUsername);
	List<Employee> getAllEmployees(Integer offset, Integer maxResults);
	List<Employee> getAllEmployees();
	List<Employee> getAllEmployees(String email);
	String updateEmployee (Employee employee);
	String changePassword(String email,String password);
	String changePassword(String email);
	String deactivateEmployee(String email);
	Integer count();
	
	

}
