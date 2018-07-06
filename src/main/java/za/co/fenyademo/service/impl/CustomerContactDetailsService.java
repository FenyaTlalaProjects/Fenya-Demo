package za.co.fenyademo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.fenyademo.bean.CustomerBean;
import za.co.fenyademo.dao.CustomerContactDetailsDaoInt;
import za.co.fenyademo.model.CustomerContactDetails;
import za.co.fenyademo.service.CustomerContactDetailsServiceInt;

@Service("CustomerContactDetailsService")
public class CustomerContactDetailsService implements CustomerContactDetailsServiceInt{

	
	@Autowired
	private CustomerContactDetailsDaoInt contactDetailsDaoInt;
	
	@Override
	public CustomerBean contactDetails(String customerName) {	
		
		return contactDetailsDaoInt.contactDetails(customerName);
	}

	@Override
	public List<CustomerContactDetails> contacts(String customerName) {
		return null;
	}

	@Override
	public List<CustomerContactDetails> contacts() {
		return null;
	}

	@Override
	public CustomerContactDetails getContactPerson(String customerName) {
	
		return contactDetailsDaoInt.getContactPerson(customerName);
	}

}
