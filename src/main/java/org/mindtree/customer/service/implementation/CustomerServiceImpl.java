package org.mindtree.customer.service.implementation;

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
		Customer foundCustomer = customerRepository
									.findById(id)
									.orElseThrow(()->new ResourceNotFoundException("Customer with id : "+ id+" Not Found"));
		return foundCustomer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}
	

}
