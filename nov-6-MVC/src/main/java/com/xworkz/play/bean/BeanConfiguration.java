package com.xworkz.play.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.play")
public class BeanConfiguration {
	public BeanConfiguration()
	{
		System.out.println("Creating the page");
	}  
}
