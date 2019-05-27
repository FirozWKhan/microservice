package com.frk.service;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.frk.dao.CustomerDaoImpl;
import com.frk.entity.CustomerEntity;

public class CustomerServiceTest {

	@InjectMocks
	CustomerService customerService;

	@Mock
	CustomerDaoImpl customerDaoImpl;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllCustomer() {

		List<CustomerEntity> value = new ArrayList<CustomerEntity>();
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setId("123");
		customerEntity.setFname("Tushar");
		customerEntity.setLname("Borkar");
		value.add(customerEntity);
		when(customerDaoImpl.getCustomerAll()).thenReturn(value);
		customerService.getAllCustomer();
	}

}
