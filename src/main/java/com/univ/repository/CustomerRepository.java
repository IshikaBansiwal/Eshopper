package com.univ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.univ.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
@Query("select c from Customer c where c.unm=?1 AND c.pw=?2")
public Customer getLogin(String unm, String pw);
List<Customer> findAll();
}