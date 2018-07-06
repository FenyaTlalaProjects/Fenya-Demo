package za.co.fenyademo.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import za.co.fenyademo.bean.CustomerBean;
import za.co.fenyademo.model.Customer;
import za.co.fenyademo.model.Employee;
import za.co.fenyademo.service.CustomerContactDetailsServiceInt;
import za.co.fenyademo.service.CustomerServiceInt;




@Controller
public class CustomerController {
	
	@Autowired
	private CustomerServiceInt customerServiceInt;
	@Autowired
	private HttpSession session;
	
	private String retMessage = null;
	ModelAndView model = null;

	Customer customer = null;
	Employee userName = null;
	
	@RequestMapping(value="addClient",method=RequestMethod.GET)
	public ModelAndView loadAddClient() {
		
	    model = new ModelAndView("addClient");
	    userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){
			model.addObject("saveClient", new CustomerBean());
			model.setViewName("addClient");		
		}
		else{
			model.setViewName("login");
		}
		
		return model;
	}
	@RequestMapping(value="saveClient",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView addClient(@ModelAttribute("saveClient")CustomerBean customerBean)
	{
		String addCustomer = "addCustomer";
	    model = new ModelAndView();
	    userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){
			model.addObject("retMessage",customerServiceInt.saveCustomer(customerBean));			
			model.addObject("addCustomer", addCustomer);
			model.setViewName("confirmations");
		}else{
			model.setViewName("login");
		}
		return model;
	}
	
	@RequestMapping(value="clientInformation",method=RequestMethod.GET)
	public ModelAndView loadClientInformation() {
		
	    model = new ModelAndView();
	    userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){		
			model.setViewName("clientInformation");
		}else{
			model.setViewName("login");
		}
		
		return model;
	}
	

	@RequestMapping(value="updateCustomer",method=RequestMethod.GET)
	public ModelAndView loadUpdateCustomerPage(){
		
		model = new ModelAndView("updateCustomer");
		userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){
		
			model.addObject("updateCustomerData", new CustomerBean());
			
			model.setViewName("updateCustomer");
		}
		else{
			model.setViewName("login");
		}
		return model;
	}

	
	
	
	
	@RequestMapping(value={"displayCustomers","userDisplayCustomers"},method=RequestMethod.GET)
	public ModelAndView displayCustomers(Integer offset,Integer maxResults){
		model= new ModelAndView();
		Integer count =0;
		userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){
		
			if (userName.getRole().equalsIgnoreCase("Manager") || userName.getRole().equalsIgnoreCase("Admin")) {
				count = customerServiceInt.count();
				model.addObject("count",count);
				model.addObject("offset", offset);
				model.addObject("displayCustomers", customerServiceInt.getClientList());			
				model.setViewName("displayCustomers");
			
		   }else if(userName.getRole().equalsIgnoreCase("User")){			   
			   count = customerServiceInt.count();
			   model.addObject("count",count);
			   model.addObject("offset", offset);
			   model.addObject("displayCustomers", customerServiceInt.getClientList());				
			   model.setViewName("userDisplayCustomers"); 
			   
		   }
		}
		else{
			model.setViewName("login");
		}
		return model;
	}
	@RequestMapping(value={"searchCustomerdevices", "userSearchCustomerDevices"})
	public ModelAndView searchCustomerDevices(@RequestParam("customerName") String customerName,@ModelAttribute Customer customer) {
		model = new ModelAndView();
		userName = (Employee) session.getAttribute("loggedInUser");
		if(userName != null){		
			if (userName.getRole().equalsIgnoreCase("Manager") || userName.getRole().equalsIgnoreCase("Admin")) {
				//model.addObject("deviceList",deviceServiceInt.getDeviceListByClientName(customerName));				
				model.setViewName("customerListDevices");
		   }else if(userName.getRole().equalsIgnoreCase("User")){			   
			   //model.addObject("deviceList",deviceServiceInt.getDeviceListByClientName(customerName));			  
			   model.setViewName("userViewCustomerListDevices");
		   }
		}
		else{
			model.setViewName("login");
		}
		
		return model;
	}
}
