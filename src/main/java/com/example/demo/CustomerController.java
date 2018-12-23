package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	public static List<Customer> list = new ArrayList<Customer>();
	static {
		list.add(new Customer(1, "Firoz", "Khan"));
		list.add(new Customer(2, "Michal", "Jhon"));
		list.add(new Customer(3, "Dan", "Frank"));
		list.add(new Customer(4, "Merry", "Chris"));
	}

	@RequestMapping("/all")
	public List<Customer> getAllCustomerData() {
		return list;
	}

	@RequestMapping("/{id}/info")
	public Optional<Customer> getCustomerInfo(@PathVariable("id") int id) {
		Optional<Customer> customer = list.stream().filter(s -> s.getId() == id).findAny();
		return customer;
	}

}
