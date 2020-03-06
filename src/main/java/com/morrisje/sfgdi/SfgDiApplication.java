package com.morrisje.sfgdi;

import com.morrisje.sfgdi.controllers.ConstructorInjectedController;
import com.morrisje.sfgdi.controllers.MyController;
import com.morrisje.sfgdi.controllers.PropertyInjectedController;
import com.morrisje.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);


		System.out.println("-------- Property Based -------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context
				.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter Based ------");
		SetterBasedController setterBasedController = (SetterBasedController) context
				.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());

		System.out.println("------- Constructor Based -------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
