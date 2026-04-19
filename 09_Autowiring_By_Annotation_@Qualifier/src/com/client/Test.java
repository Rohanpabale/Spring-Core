package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
Student st = (Student)	applicationContext.getBean("s");
System.out.println(st.getId());
System.out.println(st.getName());
System.out.println(st.getAddress().getCity());
System.out.println(st.getAddress().getState());
}
}
