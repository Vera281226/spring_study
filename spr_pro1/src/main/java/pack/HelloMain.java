package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		Message message = new Message();
		message.sayHello("V");
		
		MessageInter inter = message;
		inter.sayHello("V");
		
		// Spring Framework 사용
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		// context 사용 시 Object 타입으로 만들어져 캐스팅해야한다
		// new가 필요없다
		MessageInter messageInter = (MessageInter)context.getBean("msg");
		messageInter.sayHello("V");		
	}
}