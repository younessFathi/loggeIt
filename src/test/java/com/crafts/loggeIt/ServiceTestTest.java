package com.crafts.loggeIt;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.crafts.loggeIt.interceptor.AuditedInterceptor;

public class ServiceTestTest {
	Weld weld;
	WeldContainer container;

	@Before
	public void init() {
		weld = new Weld();
		container = weld.initialize();
	}

	@After
	public void shutdown() {
		weld.shutdown();
	}

	@Test
	public void givenTheServiceWhenMethodAndInterceptorExecutedThenOK() {
		ServiceTest service = container.select(ServiceTest.class).get();
		service.print();
		Assert.assertTrue(AuditedInterceptor.calledBefore);
		Assert.assertTrue(AuditedInterceptor.calledAfter);
	}
}
