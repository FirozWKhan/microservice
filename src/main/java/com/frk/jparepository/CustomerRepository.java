package com.frk.jparepository;

import org.springframework.data.repository.CrudRepository;

import com.frk.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
	
}
