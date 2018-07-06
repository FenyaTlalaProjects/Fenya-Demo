package za.co.fenyademo.service;

import java.util.List;

import za.co.fenyademo.bean.CustomerBean;
import za.co.fenyademo.model.CustomerContactDetails;

public interface CustomerContactDetailsServiceInt {
	CustomerBean contactDetails(String customerName);
	List<CustomerContactDetails> contacts(String customerName);
	List<CustomerContactDetails> contacts();
	CustomerContactDetails getContactPerson(String customerName);

}
