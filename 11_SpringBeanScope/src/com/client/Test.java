package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
	Student st = (Student)applicationContext.getBean("s");
	System.out.println(st.getId()+" "+st.getName());
	
	Student st1 = (Student)applicationContext.getBean("s");
	System.out.println(st.getId()+" "+st.getName());

	Student st2 = (Student)applicationContext.getBean("s");
	System.out.println(st.getId()+" "+st.getName());
	
	System.out.println(st.hashCode());
	System.out.println(st1.hashCode());
	System.out.println(st2.hashCode());
	
}
}
