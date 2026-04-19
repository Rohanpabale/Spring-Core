package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfig;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyConfig.class);
	Student st = (Student)applicationContext.getBean("student");
	System.out.println(st.getId()+" "+st.getName());
	
	
}
}
