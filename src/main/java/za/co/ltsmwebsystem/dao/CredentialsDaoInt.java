package za.co.ltsmwebsystem.dao;

import java.util.List;

import za.co.ltsmwebsystem.model.Credentials;

public interface CredentialsDaoInt {
	
	boolean saveNewPassword(Credentials credentials);
	List<Credentials> getCredentialsForUser(String email);
	List<Credentials> getCredentialsForUser();
	long passwordDateDifference(String userName);
	Credentials getEmployeePasswordInfo(String userName);
	Credentials getCurrentPasswordDate(String userName);
	

}
