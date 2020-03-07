package com.frk.model;

import static org.junit.Assert.*;
import static com.frk.model.Addition.getsubmissiomoftwonumber;
import org.junit.Test;

public class AdditonTest {
	Addition ad = new Addition();

	@Test
	public void getsubmissiomoftwonumber1() {
		int i = getsubmissiomoftwonumber(2, 4);
		assertEquals(6, i);
	}

	@Test
	public void subZeroTest() {
		int d = ad.sub(0, 9);
		assertEquals(0, d);
	}
	@Test
	public void subNonZeroTest() {
		int d = ad.sub(19, 9);
		assertEquals(10, d);
	}
	@Test
	public void mul() {
		int d = ad.mul(2, 2);
		assertEquals(4, d);
	}

	@Test
	public void div() {
		int d = ad.div(10, 2);
		assertEquals(5, d);
	}

}