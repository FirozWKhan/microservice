package com.frk.dao;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frk.entity.CustomerEntity;
import com.frk.jparepository.CustomerRepository;
import com.frk.model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl {

	
	  @PersistenceContext EntityManager em;
	  
	  @Autowired
	  CustomerRepository cr;
	 
	
	public String saveCustomer(Customer cr) {
		CustomerEntity ce = new CustomerEntity();
		ce.setId(UUID.randomUUID().toString().replace("-",""));
		ce.setFname(cr.getFname());
		ce.setLname(cr.getLname());
		
		em.persist(ce);
		
		return "done";
		
	}
	
	public List<CustomerEntity> getCustomerAll(){
		List<CustomerEntity> crlist = (List<CustomerEntity>) cr.findAll();
		return crlist;
	}
	
}
