package com.prowings;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeByInterface implements InitializingBean, DisposableBean{
int id;
String name;
String address;
public EmployeeByInterface() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeByInterface(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public void destroy() throws Exception {
	System.out.println("inside destroy() of EmployeeByInterface");	
}
public void afterPropertiesSet() throws Exception {
	System.out.println("inside init() of EmployeeByInterface");
	
}
@Override
public String toString() {
	return "EmployeeByInterface [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
