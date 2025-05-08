package anno2;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class AbcProcess {
	@Resource(name="abc") // 자바가 지원하는 name에 의한 매핑 어노테이션 필드 인젝션
	private Abc abc;
	private Abc2 abc2;  
	
	@Resource(name="abc2") // 세터 인젝션
	public void setAbc2(Abc2 abc2) {
		this.abc2 = abc2;
	}
	
	public void showData() {
		abc.setIrum("홍길동");
		abc2.setNai(28);
		
		System.out.println("이름은 "+abc.getIrum()+" 나이는 "+abc2.getNai());
	}
}