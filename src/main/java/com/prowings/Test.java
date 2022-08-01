package com.prowings;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext cts=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentXml s=(StudentXml) cts.getBean("std");
	System.out.println(s);
	EmployeeByInterface e=(EmployeeByInterface) cts.getBean("emp");
	System.out.println(e);
	CustomerByAnnotation c=(CustomerByAnnotation) cts.getBean("cust");
	System.out.println(c);
	cts.registerShutdownHook();
	
}
}
