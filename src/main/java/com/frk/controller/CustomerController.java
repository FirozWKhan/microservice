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
		list.add(new Customer(1, "Firoz", "Khan11111"));
		list.add(new Customer(2, "Michal", "Jhon1111"));
		list.add(new Customer(3, "Dan", "Franooooooooksssss"));
		list.add(new Customer(4, "Merry", "Chrissssss"));

		list.add(new Customer(4, "Merry", "Chrisssssssssss"));

		list.add(new Customer(4, "Merry", "Chrissssss"));
		list.add(new Customer(4, "Merry", "Chrissssss11111"));
		list.add(new Customer(4, "Merry", "Chrissssss"));
		list.add(new Customer(4, "Merry", "Chrissssss"));
		list.add(new Customer(4, "Merry", "Chrissssss"));
		list.add(new Customer(4, "Merry", "Chrissssss111"));

	}

	@RequestMapping("/all")
	public List<Customer> getAllCustomerData() {
		System.out.println("afiya chnges");
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

		
		System.out.println("hlw");
		

		System.out.println("KK");

		return "saved";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String updateCustomerInfo(@RequestBody Customer cr) {
		cd.saveCustomer(cr);
		return "saved";
	}
	public void test(){
		System.out.println("hellooo");

		System.out.println("hellooo");
		System.out.println("hellooo");
		
		
		
	}
	

}
