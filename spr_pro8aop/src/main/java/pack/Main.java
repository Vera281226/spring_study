package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		// AOP 적용 전
		//MessageInter inter = (MessageInter)context.getBean("messageImpl");
		//inter.sayHi();
		// AOP 적용 후
		MessageInter inter = (MessageInter)context.getBean("proxy");
		inter.sayHi();
	}
}