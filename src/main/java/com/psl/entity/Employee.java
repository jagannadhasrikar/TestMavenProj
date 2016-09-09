package com.psl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp") //bean id
public class Employee {

	@Value(value="1")
	private int id;
	@Value(value="jagannadha")
	private String name;
	
	@Autowired
	private Address addr;


	public Employee() {
		System.out.println("In default constructor of Employee");	
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Address addr) {
		System.out.println("In param constructor of Employee");
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("In setId");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("In setName");
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		System.out.println("In setAddr");
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	public void abc(){
		System.out.println("init abc");	
	}

	public void pqr(){
		System.out.println("destroy pqr");	
	}

}
