package za.co.fenyademo.dao;



import java.util.List;

import za.co.fenyademo.model.UserLogDetails;

public interface UserLogDetailsDaoInt {
	
	void saveUserLogDetails(UserLogDetails details);
	List<UserLogDetails> getLogoutDateTime();
	List<UserLogDetails> getUserLogDetails();
	void lougoutTimeStamp();
	void updateTimeout(String sessionID);
	UserLogDetails getUserLogDetails(String sessionID);
	void getLastUserLogDetails(String userEmail);
	List<UserLogDetails> userActivities(String email);
	

}
