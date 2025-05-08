package pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MyBusiness myBusiness = (MyBusiness)context.getBean("myBusiness");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("상품명 : ");
        String name = scanner.nextLine();
        myBusiness.setName(name);

        System.out.print("수량 : ");
        int su = scanner.nextInt();
        myBusiness.setSu(su);

        System.out.print("단가 : ");
        int dan = scanner.nextInt();
        myBusiness.setDan(dan);
		
		myBusiness.displayData();
		scanner.close();
	}
}