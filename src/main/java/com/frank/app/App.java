package com.frank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frank.app.model.Person;
import com.frank.app.spring.AppContextHolder;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		/**
		 * Usage 1 Get ApplicationContext
		 */
		ApplicationContext appContext = AppContextHolder.getApplicationContext();
		Person person = appContext.getBean("person", Person.class);
		/**
		 * Usage 2 Get ApplicationContext
		 * <code>Person person = AppContextHolder.getBean("person", Person.class);</code>
		 */
		
		System.out.println(person.getName());
	}
}