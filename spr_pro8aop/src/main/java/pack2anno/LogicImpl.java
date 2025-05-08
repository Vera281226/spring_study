package pack2anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter {
	@Autowired
	public ArticleInter articleInter;
	
	public LogicImpl() {
		
	}
	
	@Override
	public void selectDataProcess() {
		System.out.println("selectDataProcess 수행");
		articleInter.selectAll();
	}
	@Override
	public void selectDataProcess2() {
		System.out.println("selectDataProcess2 수행");
		articleInter.selectAll();
	}
}