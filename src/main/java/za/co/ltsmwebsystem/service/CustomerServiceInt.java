package za.co.ltsmwebsystem.service;

import java.util.List;

import za.co.ltsmwebsystem.bean.CustomerBean;
import za.co.ltsmwebsystem.model.Customer;

public interface CustomerServiceInt {
	
	Customer getClientByClientName(String clientName);
	List<Customer> getClientList(Integer offset, Integer maxResults);
	List<Customer> getClientList();
	List<Customer> getClientList(String customerName);
	String updateCustomer(CustomerBean customerBean);
	Integer count();
	CustomerBean contactDetails(String customerName);
	String saveCustomer(CustomerBean customerBean);

}
