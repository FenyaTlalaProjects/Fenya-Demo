package za.co.ltsmwebsystem.dao;

import java.util.List;

import za.co.ltsmwebsystem.bean.CustomerBean;
import za.co.ltsmwebsystem.model.Customer;

public interface CustomerDaoInt {
	
	Customer getClientByClientName(String clientName);
	List<Customer> getClientList(Integer offset, Integer maxResults);
	List<Customer> getClientList();
	List<Customer> getClientList(String customerName);
	Integer count();
	CustomerBean contactDetails(String customerName);
	String updateCustomer(CustomerBean customerBean);
	String saveCustomer(CustomerBean customerBean);
	
	

}
