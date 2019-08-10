package com.customer.ha.devops.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.customer.ha.devops.model.Customer;

@Service
public class CustomerService{

	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public CustomerService() {
		Customer customer;
		customer = new Customer();
		customer.setCustomerID("456000");
		customer.setAddressLine1("Flat 304, Pembroke House");
		customer.setAddressLine2("21 Academy Way");
		customer.setAddressLine3("Dagenham");
		customer.setCity("London");
		customer.setPostCode("RM8 2FE");
		customer.setPhoneNumber("07440787123");
		customers.add(customer);
		
		customer = new Customer();
		customer.setCustomerID("456001");
		customer.setAddressLine1("ABC Bank");
		customer.setAddressLine2("Red Lion Court");
		customer.setAddressLine3("Park Street");
		customer.setCity("London");
		customer.setPostCode("SE1 9EQ");
		customer.setPhoneNumber("07450992345");
		customers.add(customer);
		
	}
	
	public Customer getCustomerDetails(String customerID) {
		for(Customer customer:customers) {
			if(customer.getCustomerID().equalsIgnoreCase(customerID)) {
				return customer;
			}
		}
		return null;
		
	}
	
	public ArrayList<Customer> getAllCustomers () {
		return customers;
	}
	
}
