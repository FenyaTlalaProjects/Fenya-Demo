package za.co.ltsmwebsystem.dao;

import java.util.List;

import za.co.ltsmwebsystem.bean.CustomerBean;
import za.co.ltsmwebsystem.model.CustomerContactDetails;

public interface CustomerContactDetailsDaoInt {
	void saveContactDetails(List<CustomerContactDetails> list);
	CustomerBean contactDetails(String customerName);
	List<CustomerContactDetails> contacts(String customerName);
	List<CustomerContactDetails> contacts();
	CustomerContactDetails getContactPerson(String customerName);
	

}
