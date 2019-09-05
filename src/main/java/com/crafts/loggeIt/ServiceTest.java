package com.crafts.loggeIt;

import com.crafts.loggeIt.annotation.Audited;

public class ServiceTest {
	
	@Audited	
	public void print() {
		System.out.println("audited");
	}

}
