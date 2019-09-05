package com.crafts.loggeIt.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.crafts.loggeIt.annotation.Audited;
@Interceptor
@Audited
public class AuditedInterceptor {

	public static boolean calledBefore = false;
	public static boolean calledAfter = false;

	@AroundInvoke
	public Object auditMethod(InvocationContext ctx) throws Exception {
		System.out.println("ok");
		calledBefore = true;
		Object result = ctx.proceed();
		calledAfter = true;
		return result;
	}

}
