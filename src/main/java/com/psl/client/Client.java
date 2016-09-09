package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;
import com.psl.entity.Employee;
import com.psl.service.EmployeeService;

public class Client {
	
	private static EmployeeService service; 

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
	
	
	public static void main(String[] args) throws Exception {

		//Spring container initialization
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); 

	//get Beans
//		Employee e = (Employee)context.getBean("emp");

		//invoking business logic
	//	System.out.println(e.toString());
		
		//context.close();
		
	//	context.registerShutdownHook();
		
		//System.out.println("In client add employee flow");
		
	//	service.addEmployee(e);
	//	System.out.println("Done adding Employee");
		
//	System.out.println("In getAllEmployees");
//	List<Employee> list = service.getAllEmployees();
//	
//	for (Employee employee :list){
//		System.out.println("~"+employee.getId()+" ~ "+employee.getName());
//	}
//	System.out.println("Done retrieving employees");
		
		Performer p = (Performer) context.getBean("performer");
		
		p.perform();
		
		System.out.println("I am gawwd");
	
	
	}


}
