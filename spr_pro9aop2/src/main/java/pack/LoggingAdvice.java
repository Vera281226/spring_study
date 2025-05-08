package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect // 관심 사항을 가짐
@Component
public class LoggingAdvice {
	@Around("execution(public void startProcess())")
	public Object v(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("id 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		scanner.close();
		if(!id.equals("aa")) {
			System.out.println("아이디 불일치 - 작업 종료");
			return null;
		}
		Object object = joinPoint.proceed(); // 핵심 메소드 수행
		System.out.println("메소드 수행 후 마무리 작업");
		return object;
	}
}