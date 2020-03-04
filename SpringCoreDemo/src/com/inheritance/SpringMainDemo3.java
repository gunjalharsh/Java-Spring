package com.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.EmployeeBean;

public class SpringMainDemo3 {

	public static void main(String[] args) {

		
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpringConfig1.xml");
		
		Student_course my3=(Student_course) ac.getBean("course1");
		
		System.out.println("Sid :"+my3.getSid());
		System.out.println("name(overriden) :"+my3.getName());
		System.out.println("Cid :"+my3.getCid());
		System.out.println("Cname :"+my3.getCname());


	}

}
