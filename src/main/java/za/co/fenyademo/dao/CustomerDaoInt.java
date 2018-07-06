package za.co.fenyademo.dao;

import java.util.List;

import za.co.fenyademo.bean.CustomerBean;
import za.co.fenyademo.model.Customer;

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
