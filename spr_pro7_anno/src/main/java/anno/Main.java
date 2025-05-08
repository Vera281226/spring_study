package anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno2.AbcProcess;

public class Main {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
	SenderProcess process = context.getBean("senderProcess", SenderProcess.class);
	process.displayData();
	
	AbcProcess process2 = context.getBean("AbcProcess", AbcProcess.class);
	process2.showData();
	}
}