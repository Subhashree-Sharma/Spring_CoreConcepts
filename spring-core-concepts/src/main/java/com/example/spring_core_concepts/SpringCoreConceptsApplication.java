package com.example.spring_core_concepts;

import com.example.spring_core_concepts.beans.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);

		//Retrieve EmployeeBean from Application Context
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		//Corrected method call
		employeeBean.showEmployeeDetails();
	}
}
