package com.frk.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	Customer c = new Customer();

	@Test
	public void getIdTest() {
		c.setId(1);
		int i = c.getId();
		assertEquals(1, i);
		
	}

	@Test
	public void getFnameTest() {
		c.setFname("afiya");
		String s = c.getFname();
		assertEquals("afiya", s);
	}

	@Test
	public void getLnameTest() {
		c.setLname("khan");
		String s = c.getLname();
		assertEquals("khan", s);
	}
	@Test
	public void setIdTest(){
		   
		 //  assertEquals(c.setId(1),c.getId());
		
		   c.setId(1);
		   assertEquals(1, c.getId());
		   
	}
	@Test
	public void setFnameTest(){
		c.setFname("firoz");
		assertEquals("firoz", c.getFname());
	}
	@Test
	public void setLnameTest(){
		System.out.println("h");
		c.setLname("khan1");
		assertEquals("khan1", c.getLname());
	}
	

}
