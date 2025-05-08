package anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component // Sender sender = new Sender();
//@Component("abc") // Sender abc = new Sender();
@Scope("singleton")
public class Sender implements SenderInter{
	@Override
	public void show()	{
		System.out.println("show 메소드 수행");
	}
}