package com.prowings;

public class StudentXml {
int id;
String name;
String address;
public StudentXml() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentXml(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public void init() {
	System.out.println("inside init() of StudentXml");
}
public void destroy() {
	System.out.println("inside destroy() of StudentXml");
}
@Override
public String toString() {
	return "StudentXml [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
