package com.frk.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.frk.dao.CustomerDaoImpl;
import com.frk.entity.CustomerEntity;
import com.frk.model.Customer;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
	
	
	
		@Mock
	    private CustomerDaoImpl daoMock;
		
	    @InjectMocks
	    private CustomerService service;
	    
	    @Before
	    public void setUp() throws Exception {
	         MockitoAnnotations.initMocks(this);
	    }
	    
	    
	    @Test
	    public void getAllCustomerTest() {
	    
		
	     
	     List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
	     	
	     	CustomerEntity entity = new CustomerEntity();
	     	entity.setFname("abc");
	     	entity.setEmail("afiya@");
	     	customerList.add(entity);
			Mockito.when(daoMock.getCustomerAll()).thenReturn(customerList);
			
			List<Customer> allCustomer = service.getAllCustomer();
			Customer customer = allCustomer.get(0);
			
			Assert.assertEquals("abc",customer.getFname() );
	    }
}
