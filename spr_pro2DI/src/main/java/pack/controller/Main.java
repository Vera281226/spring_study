package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.model.DataDao;
import pack.model.DataDaoImpl;

public interface Main {
	public static void main(String[] args) {
		// Spring 미사용
		DataDaoImpl daoImpl = new DataDaoImpl();
		DataDao dataDao = daoImpl;
		// <bean id="daoImpl" class="pack.model.DataDaoImpl"/>
		
		// 비즈니스 로직 수행
		SelectServiceImpl selectImpl = new SelectServiceImpl(dataDao);
		SelectService service = selectImpl;
		service.selectProcess();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		SelectService service2 = (SelectService) context.getBean("selectImpl");
	}
}