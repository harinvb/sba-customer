package org.mindtree.customer.service.implementation;

import java.util.List;

import org.mindtree.customer.dao.CustomerRepository;
import org.mindtree.customer.entity.Customer;
import org.mindtree.customer.exception.ResourceNotFoundException;
import org.mindtree.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Customer with id : "+ id+" Not Found"));
		 
	}

	@Override
	public Customer addCustomer(Customer customer) { 
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	

}
