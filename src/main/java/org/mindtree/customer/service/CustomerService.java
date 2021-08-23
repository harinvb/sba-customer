package org.mindtree.customer.service;

import javax.validation.Valid;

import org.mindtree.customer.entity.Customer;


public interface CustomerService {
	
	public Customer getCustomerById(int id);

	public Customer addCustomer(@Valid Customer customer);

}
