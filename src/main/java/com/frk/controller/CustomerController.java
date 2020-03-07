package com.frk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frk.dao.CustomerDaoImpl;
import com.frk.model.Customer;
import com.frk.service.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
	CustomerDaoImpl cd ;
	@Autowired
	CustomerService cr;
	public static List<Customer> list = new ArrayList<Customer>();
	static {
		list.add(new Customer(1, "Firoz", "Khan"));
		list.add(new Customer(2, "Michal", "Jhon"));
		list.add(new Customer(3, "Dan", "Frank"));
		list.add(new Customer(4, "Merry", "Chris"));

		list.add(new Customer(5,"hh","kkk"));
		

		list.add(new Customer(6,"af","aa"));

		System.out.println("hlw");
		
		
		
	}

	@RequestMapping("/all")
	public List<Customer> getAllCustomerData() {
		return cr.getAllCustomer();
	}
	

	@RequestMapping("/{id}/info")
	public Optional<Customer> getCustomerInfo(@PathVariable("id") int id) {
		Optional<Customer> customer = list.stream().filter(s -> s.getId() == id).findAny();
		return customer;
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveCustomerInfo(@RequestBody Customer cr) {
		cd.saveCustomer(cr);
		return "saved";
	}
	

}
