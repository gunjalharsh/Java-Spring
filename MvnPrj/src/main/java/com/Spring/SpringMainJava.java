package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainJava {

	public static void main(String[] args) {
		// Application Context provide access to bean factory methods
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpringConfig.xml");// loading the definitions from the given XML file and automatically refreshing the context.
		
		SpringDemo myBean=(SpringDemo) ac.getBean("Bean1");
		myBean.display();
		
		
		
		

	}

}
