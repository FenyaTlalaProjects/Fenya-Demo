package za.co.ltsmwebsystem.service;

import java.util.List;

import za.co.ltsmwebsystem.model.UserLogDetails;

public interface UserLogDetailsServiceInt {
	
	void saveUserLogDetails(UserLogDetails details);
	void updateTimeout(String sessionID);
	UserLogDetails getUserLogDetails(String sessionID);
	List<UserLogDetails> userActivities(String email);
	void getLastUserLogDetails(String userEmail);

}
