package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
        MyInter inter = (MyInter) context.getBean("myImpl"); // Bean 이름 소문자로 통일
        inter.inputData();
        inter.showResult();
    }
}