package com.in28minutes.learnspringframework.oswin.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@ComponentScan
@Configuration
public class Runner {
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(Runner.class)) {

			int m = context.getBean(BusinessCalculation.class).findMax();
			System.out.println(m);
		}
	}

}
