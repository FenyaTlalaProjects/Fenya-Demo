package za.co.fenyademo.service;

import za.co.fenyademo.model.Employee;
import za.co.fenyademo.model.LoginAttempt;

public interface LoginAttemptServiceInt {

	void upsertUserAttempt(LoginAttempt userLoginAttempt);
	LoginAttempt getLoginUser(String userName);
	LoginAttempt getEmployeeDetails(Employee employee);
	void userLoggeIn(Employee employee);
}
