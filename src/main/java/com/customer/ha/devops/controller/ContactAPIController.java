package com.customer.ha.devops.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.ha.devops.model.Customer;
import com.customer.ha.devops.service.CustomerService;

@RestController
public class ContactAPIController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(path="/")
	public ArrayList<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(path="/customers")
	public ArrayList<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(path="/customer/{customerID}")
	public Customer getCustomer(@PathVariable("customerID") String customerID) {
		return customerService.getCustomerDetails(customerID);
	}
}
