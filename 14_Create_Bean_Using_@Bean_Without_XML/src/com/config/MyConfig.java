package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.model.Student;

@Configuration
public class MyConfig {
	@Bean
public Student getBeanUsingBeanAnnotation() {
	return new Student(101,"ram");
}
}
