package com.frk.model;

public class Addition {

	public static int getsubmissiomoftwonumber(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int d, int b) {
		
		if(d<=0){
		return 0;
		}
		else {
		int c = d - b;
		return c;
	}
	}

	public int mul(int d, int b) {
		int c = d * b;
		return c;
	}

	public int div(int d, int b) {
		int c = d / b;
		return c;
	}
}
