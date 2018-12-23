package com.frk.dao;

import java.util.Random;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.frk.entity.CustomerEntity;
import com.frk.model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl {

	
	  @PersistenceContext EntityManager em;
	 
	
	public String saveCustomer(Customer cr) {
		CustomerEntity ce = new CustomerEntity();
		ce.setId(UUID.randomUUID().toString().replace("-",""));
		ce.setFname(cr.getFname());
		ce.setLname(cr.getLname());
		em.persist(ce);
		return "done";
		
	}
	
}
