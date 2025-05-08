package anno;

import org.springframework.stereotype.Component;

@Component
public class Sender2 implements SenderInter{
	@Override
	public void show()	{
		System.out.println("sender 2 show 메소드 수행");
	}
}