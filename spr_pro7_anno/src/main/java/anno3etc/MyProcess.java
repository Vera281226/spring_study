package anno3etc;

import anno2.AbcProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("my")
public class MyProcess {
	private String name;
	private String part;
	
	public MyProcess() {
		
	}
	
	@Autowired
	//public MyProcess(@Value("총무부") String part) {
	public MyProcess(@Value("#{dataInfo.part}") String part) {
		this.part = part;
	}
	
	@Value("30")
	private int age;
	
	public void showDatas() {
		System.out.println("part : "+ part);
		System.out.println("age : "+age);
	}
}