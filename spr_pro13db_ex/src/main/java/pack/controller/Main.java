package pack.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pack")
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Main.class);
		
		BussinessInter bussinessInter = context.getBean("bussinessImpl",BussinessInter.class);
		
		bussinessInter.dataPrintAll();
		
		bussinessInter.dataPrintCount();
		
		bussinessInter.dataPrintMaxpay();
	}
}