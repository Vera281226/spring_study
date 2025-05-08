package anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// @Component // 
@Service // 객체 생성 후 이 클래스의 하는 일까지 설명 @Component 역할과 같지만 가독성을 위한 이름이다
public class SenderProcess {
	//@Autowired // Field Injection 편안하다 간단하다 주로 사용된다 해당 클래스엔 컴포넌트 어노테이션이 필수다
	// Type에 의한 매핑
	// private Sender sender;
	@Autowired
	@Qualifier("sender2") // 여러 자식 객체 중 매핑할 객체 변수 이름을 적어줌
	private SenderInter senderInter;
	
	/*
	@Autowired // 세터 인젝션 자동 처리 세터가 많아지면 코드가 난잡하다
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	@Autowired // 컨스트럭터 인젝션 자동 처리 불변성의 장점이 있지만 생성자가 많아질 수 있어 난잡해진다
	public SenderProcess(Sender sender) {
		this.sender = sender;
	}
	*/
	public void displayData() {
//		sender.show();
		senderInter.show();
	}
}