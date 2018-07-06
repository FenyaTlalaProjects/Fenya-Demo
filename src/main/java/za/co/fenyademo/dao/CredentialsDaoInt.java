package za.co.fenyademo.dao;

import java.util.List;

import za.co.fenyademo.model.Credentials;

public interface CredentialsDaoInt {
	
	boolean saveNewPassword(Credentials credentials);
	List<Credentials> getCredentialsForUser(String email);
	List<Credentials> getCredentialsForUser();
	long passwordDateDifference(String userName);
	Credentials getEmployeePasswordInfo(String userName);
	Credentials getCurrentPasswordDate(String userName);
	

}
