package com.frk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frk.dao.CustomerDaoImpl;
import com.frk.entity.CustomerEntity;
import com.frk.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDaoImpl cr;
	
	public List<Customer> getAllCustomer(){
		List<CustomerEntity> customerEntityList = cr.getCustomerAll();
		List<Customer> customerList = new  ArrayList<Customer>();
				
		for (CustomerEntity ce : customerEntityList) {
			Customer m = new Customer();
			m.setFname(ce.getFname());
			m.setLname(ce.getLname());
			customerList.add(m);
		}
		
		return customerList;
	}
	
	
}
