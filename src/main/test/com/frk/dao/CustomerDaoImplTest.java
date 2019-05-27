package com.frk.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.frk.entity.CustomerEntity;
import com.frk.jparepository.CustomerRepository;
import com.frk.model.Customer;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
public class CustomerDaoImplTest {

	@InjectMocks
	CustomerDaoImpl customerDaoImpl;

	@Mock
	CustomerRepository customerRepository;

	@Mock
	EntityManager entityManager;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSaveCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFname("tushar");
		customer.setLname("BOrkar");

		customerDaoImpl.saveCustomer(customer);

	}

	@Test
	public void testGetCustomerAll() {

		List<CustomerEntity> value = new ArrayList<>();
		CustomerEntity customerEntity= new CustomerEntity();
		customerEntity.setId("12");
		customerEntity.setFname("sdf");
		customerEntity.setLname("dsfds");
		value.add(customerEntity);
		
		when(customerDaoImpl.getCustomerAll()).thenReturn(value);
		
	}

}
