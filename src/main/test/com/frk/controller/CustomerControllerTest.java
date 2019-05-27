package com.frk.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.frk.dao.CustomerDaoImpl;
import com.frk.model.Customer;
import com.frk.service.CustomerService;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerControllerTest {

	@InjectMocks
	CustomerController customerController;

	@Mock
	CustomerDaoImpl customerDaoImpl;

	@Mock
	CustomerService customerService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllCustomerData() {

		List<Customer> value = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setId(2);
		customer.setFname("sdfsd");
		customer.setLname("asfs");
		value.add(customer);
		when(customerService.getAllCustomer()).thenReturn(value);
		customerController.getAllCustomerData();
	}

	@Test
	public void testGetCustomerInfo() {
		int id = 1;
		customerController.getCustomerInfo(id);
	}

	@Test
	public void testSaveCustomerInfo() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFname("fgdg");
		customer.setLname("dfg");
		customerController.saveCustomerInfo(customer);
	}

}
