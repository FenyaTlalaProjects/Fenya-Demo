package za.co.fenyademo.dao;

import java.util.List;

import za.co.fenyademo.bean.CustomerBean;
import za.co.fenyademo.model.CustomerContactDetails;

public interface CustomerContactDetailsDaoInt {
	void saveContactDetails(List<CustomerContactDetails> list);
	CustomerBean contactDetails(String customerName);
	List<CustomerContactDetails> contacts(String customerName);
	List<CustomerContactDetails> contacts();
	CustomerContactDetails getContactPerson(String customerName);
	

}
