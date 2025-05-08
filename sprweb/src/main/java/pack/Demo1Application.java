package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args).getBean(Demo1Application.class).execute();
		
	}
	
	@Autowired
	private My my;
	
	@SuppressWarnings("unused")
	private void execute() {
		System.out.println("독립적인 응용 프로그램 작성 가능");
		my.kbs();
	}
}