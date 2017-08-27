package com.infotech.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {

	@Pointcut("within(com.infotech.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.infotech.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.infotech.dao..*)")
	public void dataAccessLayer() {

	}
}
