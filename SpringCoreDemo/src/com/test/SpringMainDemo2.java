package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainDemo2 {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		BeanDemo myBean=(BeanDemo) ac.getBean("Bean1");
		myBean.display();
		
		
		AbstractApplicationContext ac1=new AnnotationConfigApplicationContext(AnnoBean1.class);
		AnnoBean myBean1=(AnnoBean) ac1.getBean("SpringAnnoBean");
		myBean1.disp("Harshal");
		
		
		
		EmployeeBean myBean2=(EmployeeBean) ac.getBean("myemployee1");
		myBean2.show();
		

	}

	

}
