package pack2anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
		// AOP 적용 후
		LogicInter logicInter = (LogicInter)context.getBean("logicImpl");
		logicInter.selectDataProcess();
		logicInter.selectDataProcess2();
	}
}