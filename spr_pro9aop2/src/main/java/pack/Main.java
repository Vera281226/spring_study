package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopinit.xml");
		// AOP 적용 전
		LogicInter inter = (LogicInter)context.getBean("logicImpl");
		inter.startProcess();
	}
}