package com.morrisje.sfgdi;

import com.morrisje.sfgdi.controllers.ConstructorInjectedController;
import com.morrisje.sfgdi.controllers.MyController;
import com.morrisje.sfgdi.controllers.PropertyInjectedController;
import com.morrisje.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.morrisje.services", "com.morrisje.sfgdi"})
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---- Primary Greeting Service");
		System.out.println(myController.sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterBasedController.class).sayHello());

	}

}
