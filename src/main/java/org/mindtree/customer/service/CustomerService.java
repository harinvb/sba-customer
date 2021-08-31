package org.mindtree.customer.service;

import java.util.List;

import javax.validation.Valid;

import org.mindtree.customer.entity.Customer;


public interface CustomerService {
	
	Customer getCustomerById(int id);

	Customer addCustomer(@Valid Customer customer);

	List<Customer> getAllCustomers();

}
