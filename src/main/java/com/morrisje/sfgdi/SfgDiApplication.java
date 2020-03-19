package com.morrisje.sfgdi;

import com.morrisje.sfgdi.controllers.ConstructorInjectedController;
import com.morrisje.sfgdi.controllers.MyController;
import com.morrisje.sfgdi.controllers.PropertyInjectedController;
import com.morrisje.sfgdi.controllers.SetterBasedController;
import com.morrisje.sfgdi.example.FakeDataSource;
import com.morrisje.sfgdi.example.FakeJmsBroker;
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


		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());
	}

}
