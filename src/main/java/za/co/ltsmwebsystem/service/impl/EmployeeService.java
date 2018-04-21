package za.co.ltsmwebsystem.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.ltsmwebsystem.dao.EmployeeDaoInt;
import za.co.ltsmwebsystem.model.Employee;
import za.co.ltsmwebsystem.service.EmployeeServiceInt;


@Service("employeeService")
@Transactional
public class EmployeeService implements EmployeeServiceInt {

	
	@Autowired
	private EmployeeDaoInt employeeDAO;
	private String retMessage = null;
	
	public String saveEmployee(Employee employee) {
		
	   retMessage = employeeDAO.saveEmployee(employee);
		return retMessage;
		
	}

	public Employee getEmployeeByEmpNumber(String empUsername) {
		
		return employeeDAO.getEmployeeByEmpNum(empUsername);
	}
	@Override
	public List<Employee> getAllEmployees(Integer offset, Integer maxResults) {
		
		return employeeDAO.getAllEmployees(offset,maxResults);
	}

	@Override
	public String updateEmployee(Employee employee) {
		retMessage = employeeDAO.updateEmployee(employee);
		return retMessage;
	}

	@Override
	public String changePassword(String email, String password) {
		retMessage = employeeDAO.changePassword(email, password);
		return retMessage;
	}

	@Override
	public String changePassword(String email) {
		retMessage = employeeDAO.changePassword(email);
		return retMessage;
	}

	@Override
	public Integer count() {
		return employeeDAO.count();
	}

	@Override
	public String deactivateEmployee(String email) {
		return employeeDAO.deactivateEmployee(email);
	}

	@Override
	public List<Employee> getAllEmployees(String email) {
		return employeeDAO.getAllEmployees(email);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}


}
