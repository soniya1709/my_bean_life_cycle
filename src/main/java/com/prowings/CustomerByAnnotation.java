package com.prowings;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerByAnnotation {
int id;
String name;
String address;

public CustomerByAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}

public CustomerByAnnotation(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@PostConstruct
public void init() {
	System.out.println("inside init() CustomerByAnnotation");
}
@PreDestroy
public void destroy() {
	System.out.println("inside destroy() CustomerByAnnotation");
}

@Override
public String toString() {
	return "CustomerByAnnotation [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
