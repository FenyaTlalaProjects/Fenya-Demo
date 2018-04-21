package za.co.ltsmwebsystem.dao;

import za.co.ltsmwebsystem.model.Employee;
import za.co.ltsmwebsystem.model.LoginAttempt;


public interface LoginAttemptDaoInt {

	void upsertUserAttempt(LoginAttempt userLoginAttempt);
	LoginAttempt getLoginUser(String userName);
	LoginAttempt getEmployeeDetails(Employee employee);
	void userLoggeIn(Employee employee);
}
