package pack;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// joinpoint에 삽입되어 동작할 코드
		
		System.out.println("핵심 로직 수행 전에 처리 할일을 여기에 작성");
		AspectClass aspectClass = new AspectClass();
		aspectClass.abc(); // 관심 사항
		
		Object object = invocation.proceed(); // 핵심 로직 수행
		System.out.println("핵심 로직 수행 후에 처리 할일은 여기에 작성");
		return object;
	}
}