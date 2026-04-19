package com.client;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Student st = (Student) applicationContext.getBean("s");
		st.getMarks().forEach(System.out::println);
		st.getName().forEach(System.out::println);

		Map<Integer, String> map = st.getIdName();
		Set<Integer> keys = map.keySet();
		keys.forEach(key -> {
			String value = map.get(key);
			System.out.println(key + " " + value);

		});

	}
}
