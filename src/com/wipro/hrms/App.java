package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.Employee;

public class App {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//		Employee employee = ctx.getBean(Employee.class);
		Employee employee=(Employee) ctx.getBean("emp");
		System.out.println(employee);
	}

}
