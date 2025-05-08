package pack.controller;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		MessageImpl m1 = new MessageImpl("안녕", "안녕");
//		m1.sayHi();
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init.xml");
//		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:init.xml");
		// classpath 기본 시작 경로가 resource 폴더
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("pack/controller/init.xml");
		// 경로 설정 방법
		MessageImpl messageImpl = (MessageImpl)context.getBean("msgImpl");
		messageImpl.sayHi();
		MessageImpl messageImpl2 = (MessageImpl)context.getBean("msgImpl");
		messageImpl.sayHi();
		System.out.println(messageImpl);
		System.out.println(messageImpl2);
		
		// 다형성 사용
		MessageInter inter = (MessageInter)context.getBean("msgImpl");
		MessageInter inter2 = context.getBean("msgImpl", MessageInter.class);
		inter.sayHi();
		inter2.sayHi();
		context.close(); // 다른 방식으로 부르고 닫아줄 수도 있다
	}
}