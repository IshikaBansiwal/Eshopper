package com.univ.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.bean.Customer;
import com.univ.repository.CustomerRepository;

@Service
public class CustomerServices {
	@Autowired
	CustomerRepository custRepo;
	
	public Customer insert(Customer cust) {
		return(Customer) custRepo.save(cust);
	}

	public Customer checkLogin(String unm, String pw) {
		return custRepo.getLogin(unm, pw);
	}
	public List<Customer> getAllCustomers() {
	    return custRepo.findAll();
	}
}
