package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.model.Student;

@Configuration
@ComponentScan("com.model")
public class MyConfig {
}
