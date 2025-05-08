package pack;

import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter {
	public LogicImpl() {
		
	}
	
	@Override
	public void startProcess() {
		System.out.println("로직 수행");
	}
}