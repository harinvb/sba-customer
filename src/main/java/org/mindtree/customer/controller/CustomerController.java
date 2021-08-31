package org.mindtree.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.mindtree.customer.entity.Customer;
import org.mindtree.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(value = "/customers/{id}")
	public Customer getCustomerById(@PathVariable String id) {
		int idInteger = Integer.parseInt(id);
	return customerService.getCustomerById(idInteger);
	}
	
	
	@PostMapping(value = "/customers")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer addCustomer(@Valid @RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	@GetMapping(value = "/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}

}
