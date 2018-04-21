package za.co.ltsmwebsystem.service;

import java.util.List;

import za.co.ltsmwebsystem.bean.CustomerBean;
import za.co.ltsmwebsystem.model.CustomerContactDetails;

public interface CustomerContactDetailsServiceInt {
	CustomerBean contactDetails(String customerName);
	List<CustomerContactDetails> contacts(String customerName);
	List<CustomerContactDetails> contacts();
	CustomerContactDetails getContactPerson(String customerName);

}
